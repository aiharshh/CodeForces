import java.util.Scanner;

public class BMakeItIncreasing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            int ans = 0;
            boolean bruh = false;
            for(int i=n-1;i>0;i--){
                if(a[i]==0) {
                    System.out.println(-1);
                    bruh = true;
                    break;
                }
                while(a[i-1]>=a[i] && i>0 && a[i]!=0){
                    if(a[i]==0) break;
                    a[i-1] = a[i-1] / 2;
                    ans++;
                }
            }
            if(bruh==true) continue;
            else System.out.println(ans);
        }
    }
}