import java.util.Scanner;

public class CMrPerfectlyFine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int min = 2000000;
            int ans = 2000000;
            int bns = 2000000;
            int fin = 2000000;
            for(int j=0;j<n;j++){
                int m = sc.nextInt();
                String s = sc.next();
                char first = s.charAt(0);
                char second = s.charAt(1);
                if(first=='1' && second=='1') min = Math.min(m, min);
                else if(first=='1' && second=='0') ans = Math.min(ans, m);
                else if(first=='0' && second=='1') bns = Math.min(bns, m);
                if(fin!=-1) fin = Math.min((ans+bns), min);
            }
            fin = (fin==2000000) ? -1 : Math.min((ans+bns), min);
            System.out.println(fin);
        }
    }
}