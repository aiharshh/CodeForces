import java.util.*;

public class ADesorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int count = Integer.MAX_VALUE;
            boolean alreadyUnsorted = false;
            for(int i=0;i<n-1;i++){
                if((a[i]>a[i+1])){ 
                    alreadyUnsorted = true;
                    break;
                }
                int diff = a[i+1] - a[i];
                int opsNeeded = (diff / 2) + 1;
                if(opsNeeded < count) count = opsNeeded; 
            }
            if(alreadyUnsorted) System.out.println(0);
            else System.out.println(count);
        }
        sc.close();
    }
}
