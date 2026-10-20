import java.util.Scanner;

public class BMakeAp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            boolean ans = false;
            long na = 2 * b - c;
            if (na / a > 0 && na % a == 0) {  
				ans = true;
			}
            long nb = (a+c)/2;
            if (nb / b > 0 && nb % b == 0 && (c - a) % 2 == 0) { 
				ans = true;
			}
            long nc = 2 * b - a;
            if (nc / c > 0 && nc % c == 0) { 
				ans = true;
			}
            if(ans) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}