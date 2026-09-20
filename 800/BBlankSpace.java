import java.util.Scanner;

public class BBlankSpace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int max = 0;
            int ans = 0;
            for(int i=0;i<n;i++){
                int temp = sc.nextInt();
                if(temp==0) {
                    max++;
                }
                else{
                    max = 0;
                }
                ans = Math.max(ans, max);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}