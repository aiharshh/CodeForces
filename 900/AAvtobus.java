import java.util.Scanner;

public class AAvtobus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(n%2!=0 || n<4){
                System.out.println(-1);
                continue;
            }
            long minBus = (n + 5) / 6;
            long maxBus = n / 4;
            System.out.println(minBus + " " + maxBus);
        }
        sc.close();
    }
}