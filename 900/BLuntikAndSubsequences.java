import java.util.Scanner;

public class BLuntikAndSubsequences{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int noo = 0, noz = 0;
            for(int i=0;i<n;i++){
                if(a[i]==1) noo++;
                else if (a[i]==0) noz++;
            }
            System.out.println(noo * (1L << noz));
        }
        sc.close();
    }
}