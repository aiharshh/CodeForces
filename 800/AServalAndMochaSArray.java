import java.util.Scanner;

public class AServalAndMochaSArray{
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            boolean found = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    
                    // If any pair has a GCD of 2 or less, we win!
                    if (gcd(a[i], a[j]) <= 2) {
                        found = true;
                        break;
                    }
                }
                if (found) break; // Exit the outer loop early if we already won
            }
            
            if (found) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}