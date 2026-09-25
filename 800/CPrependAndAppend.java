import java.util.Scanner;

public class CPrependAndAppend{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            int i=0, j=n-1;
            while(i<j && s.charAt(i)!=s.charAt(j)){
                i++; j--;
            }
            ans = j-i+1;
            System.out.println(ans);
        }
        sc.close();
    }
}