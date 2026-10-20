import java.util.HashMap;
import java.util.Scanner;

public class BArrayCloningTechnique{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[(int)n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            long ops = 0;
            HashMap<Long, Long> frequencyMap = new HashMap<>();
            for(long value : a){
                frequencyMap.put(value, frequencyMap.getOrDefault(value, 0L)+1);
            }
            long currHighestFreq = 0;
            for(long freq : frequencyMap.values()){
                currHighestFreq = Math.max(currHighestFreq, freq);
            }
            while(currHighestFreq<n){
                ops++;
                if(currHighestFreq*2<n){
                    ops = ops + currHighestFreq;
                    currHighestFreq *= 2;
                }
                else{
                    ops += n - currHighestFreq;
                    currHighestFreq = n;
                }
            }
            System.out.println(ops);
        }
        sc.close();
    }
}