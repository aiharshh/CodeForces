import java.util.*;

public class DBalancedRound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            int count = 0;
            int i = 1;
            int max = 0;
            while(i<n){
                if((a[i] - a[i-1])<=k) {
                    max++;
                }
                else {
                    max = 0;
                }
                count = Math.max(count, max);
                i++;
            }
            System.out.println(n-count-1);
        }
        sc.close();
    }
}