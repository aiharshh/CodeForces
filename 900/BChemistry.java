import java.util.*;

public class BChemistry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            int oddCount = 0;
            for(char val : map.keySet()){
                if((map.get(val)&1)!=0) oddCount++;
            }
            if(oddCount-1<=k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}