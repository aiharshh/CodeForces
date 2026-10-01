import java.util.Scanner;

public class AEverybodyLikesGoodArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int ops = 0;
            for(int i=1;i<n;i++){
                if((a[i-1]&1)==(a[i]&1)) ops++;
            }
            System.out.println(ops);
        }
        sc.close();
    }
}