import java.util.*;
public class BMinMatrices{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k < n || k > 2 * n - 1) {
                System.out.println("-1");
                continue;
            }
            int[][] A = new int[n][n];
            int x = k - n;       
            int S = n - x;
            
            int val = 1;
            
            for (int i = 0; i < S - 1; i++) {
                A[i][i] = val++;
            }
            
            A[n - 1][n - 1] = val++;
            
            for (int i = S - 1; i < n - 1; i++) {
                A[i][n - 1] = val++;
            }
            
            for (int j = S - 1; j < n - 1; j++) {
                A[n - 1][j] = val++;
            }
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] == 0) {
                        A[i][j] = val++;
                    }
                }
            }
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(A[i][j]).append(j == n - 1 ? "" : " ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}