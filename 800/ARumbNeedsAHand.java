import java.util.*;

public class ARumbNeedsAHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] p = new int[n];
            ArrayList<Integer> s = new ArrayList<>();
            for(int i=0;i<n;i++){
                p[i] = sc.nextInt();
                
                if(p[i]!=i+1){
                    s.add(i+1);
                }
            }
            boolean possible = true;
            int k = s.size();
            for(int i=0;i<k;i++){
                if(p[s.get(i)-1] != s.get(k-i-1)){
                    possible = false;
                    break;
                }
            }
            if(possible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
