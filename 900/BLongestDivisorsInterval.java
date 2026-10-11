import java.util.Scanner;

public class BLongestDivisorsInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            int count = 1;
            while(n%count==0){
                count++;
            }
            System.out.println(count-1);
        }
        sc.close();
    }
}
