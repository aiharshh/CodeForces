import java.util.*;
public class AForked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            long kx = sc.nextLong();
            long ky = sc.nextLong();
            
            long qx = sc.nextLong();
            long qy = sc.nextLong();
            
            long[] dx = {a, a, -a, -a, b, b, -b, -b};
            long[] dy = {b, -b, b, -b, a, -a, a, -a};
            
            HashSet<String> kingAttackers = new HashSet<>();
            for (int i = 0; i < 8; i++) {
                long nx = kx + dx[i];
                long ny = ky + dy[i];
                kingAttackers.add(nx + "," + ny); 
            }
            
            HashSet<String> queenAttackers = new HashSet<>();
            for (int i = 0; i < 8; i++) {
                long nx = qx + dx[i];
                long ny = qy + dy[i];
                queenAttackers.add(nx + "," + ny);
            }
            
            int commonSpots = 0;
            for (String pos : kingAttackers) {
                if (queenAttackers.contains(pos)) {
                    commonSpots++;
                }
            }
            
            System.out.println(commonSpots);
        }
        sc.close();
    }
}