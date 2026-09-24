import java.util.Scanner;

public class AWeNeedTheZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int xor = 0;
            int x = 0;
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            for(int i=0;i<n;i++) xor ^= a[i];
            if((n&1)!=0) x = xor;
            else{
                if(xor==0) x = 0;
                else x = -1;
            } 
            System.out.println(x);
        }
    }
}