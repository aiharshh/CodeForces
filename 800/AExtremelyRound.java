import java.util.Scanner;

public class AExtremelyRound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            int f = s.charAt(0) - '0';
            System.out.println((n-1)*9 + f);
        }
        sc.close();
    }
}