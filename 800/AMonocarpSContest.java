import java.util.*;
public class AMonocarpSContest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int zeros = 0;
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i]==0) zeros++;
            }
            if(zeros<2) System.out.println(-1);
            else if(a[0]==0 && a[n-1]==0) System.out.println(0);
            else if(a[0]==0 || a[n-1]==0) System.out.println(1);
            else System.out.println(2);
        }
    }
}