import java.util.Scanner;

public class AWalkingMaster{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int moves = 0;
            if(d<b || c > a+(d-b)){
                System.out.println(-1);
                continue;
            }
            moves = d-b;
            moves += a + (d-b) - c;
            System.out.println(moves);
        }
        sc.close();
    }
}