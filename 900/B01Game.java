import java.util.Scanner;

public class B01Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            int c0 = 0, c1 = 0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0') c0++;
                else c1++;
            }
            int moves = Math.min(c0, c1);
            if((moves&1)==0) System.out.println("NET");
            else System.out.println("DA");
        }
        sc.close();
    }
}