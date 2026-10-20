import java.util.Scanner;

public class DDeletiveEditing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            String t = sc.next();

            int[] freq = new int[26];
            for (int i = 0; i < t.length(); i++) {
                freq[t.charAt(i) - 'A']++;
            }
            int j = t.length() - 1; // Pointer for t, starting from the end
            boolean possible = true;

            for(int i=s.length()-1;i>=0;i--){
                char ch = s.charAt(i);
                if(freq[ch - 'A']>0){
                    if(j>=0 && ch==t.charAt(j)){
                        freq[ch-'A']--;
                        j--;
                    }
                    else{
                        possible = false;
                        break;
                    }
                }
            }
            if(possible==true && j<0) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}