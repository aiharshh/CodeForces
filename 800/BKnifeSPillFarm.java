import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BKnifeSPillFarm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
            long max = Long.MIN_VALUE;
            long currentSum = 0;
            for(int i=0;i<n;i++){
                if(i>=m-1){
                    long currentScore = m * a[i] - currentSum; 
                    max = Math.max(max, currentScore);
                }
                if(m-1>0){
                    if (pq.size() < m - 1) {
                        pq.add(a[i]);
                        currentSum += a[i];
                    } else if (a[i] < pq.peek()) {
                        currentSum -= pq.poll(); 
                        pq.add(a[i]);
                        currentSum += a[i];
                    }
                }
            }
            System.out.println(max);
        }
    }
}