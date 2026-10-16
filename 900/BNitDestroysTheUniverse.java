import java.util.Scanner;

public class BNitDestroysTheUniverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            int blocks = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != 0 && (i == 0 || a[i - 1] == 0)) {
                    blocks++;
                }
            }
            System.out.println(Math.min(blocks, 2));
            }
        sc.close();
    }
}