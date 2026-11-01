import java.util.Scanner;

public class AStrangePartition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            for(int i=0;i<n;i++) sum += a[i];
            long min = (sum + x - 1) / x, max = 0;
            for(int i=0;i<n;i++){
                max += (a[i] + x - 1)/ x;
            }
            System.out.println(min + " " + max);
        }
        sc.close();
    }
}