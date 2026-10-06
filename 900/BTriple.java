import java.util.*;

public class BTriple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            HashMap<Integer, Integer> map = new HashMap<>();
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int ans = -1;
            for(int i=0;i<n;i++) map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            for(int num : map.keySet()){
                if(map.get(num)>=3) ans = num;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}