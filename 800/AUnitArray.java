import java.util.Scanner;

public class AUnitArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int pos = 0, neg = 0;
            for(int i=0;i<n;i++){
                if(a[i]==1) pos++;
                else neg++;
            }
            int ops = 0;
            while(pos<neg || neg%2==1){
                ops++; pos++; neg--;
            }
            System.out.println(ops);
        }
    }
}