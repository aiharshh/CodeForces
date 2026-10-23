import java.util.*;
import java.io.*;

public class AExcitingBets{
    public static long gcd(long a, long b){
        if(b==0) return Math.abs(a);
        return gcd(b , a%b);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==b){
                System.out.println(0 + " " + 0);
                continue;
            }
            long d = Math.abs(a - b);
            long stepDown = a % d;
            long stepUp = d - (a % d);
            long minSteps = Math.min(stepUp, stepDown);
            System.out.println(d + " " + minSteps);
        }
    }
}