import java.util.*;

public class BSumOfMedians{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n * k];
            for(int i=0;i<n*k;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            long sum = 0;
            int idx = n*k - 1 - n/2;
            for(int i=0;i<k;i++){
                sum += a[idx];
                idx -= (n/2) + 1;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}