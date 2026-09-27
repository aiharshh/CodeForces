import java.util.Scanner;

public class AOneAndTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int totalTwos = 0;
            for(int i=0;i<n;i++){
                if(a[i]==2) totalTwos++;
            }
            if((totalTwos&1)!=0){
                System.out.println(-1);
                continue;
            }
            if(totalTwos==0) {
                System.out.println(1);
                continue;
            }
            int runningTwos = 0;
            for(int i=0;i<n;i++){
                if(a[i]==2) runningTwos++;
                if(runningTwos==totalTwos/2) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
        sc.close();
    }
}