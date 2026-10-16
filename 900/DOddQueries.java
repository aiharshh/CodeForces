import java.util.Scanner;

public class DOddQueries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            long[] a = new long[n+1];
            long[] pre = new long[n+1];
            for(int i=1;i<=n;i++) {
                a[i] = sc.nextLong();
                pre[i] = pre[i-1] + a[i];
            }
            long totalSum = pre[n];
            for(int qq=0;qq<q;qq++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                long rangeSum = pre[r] - pre[l-1];
                int count = r - l + 1;
                long newSum = totalSum - rangeSum + (count * k);

                if((newSum&1)!=0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        sc.close();
    }
}