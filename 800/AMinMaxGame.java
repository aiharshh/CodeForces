import java.util.*;
public class AMinMaxGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int noo = 0, noz = 0;
            for(int i=0;i<n;i++){
                int temp = sc.nextInt();
                if(temp==0) noz++;
                else noo++;
            } 
            if(noo>=noz) System.out.println("Bessie");
            else System.out.println("Elsie");
        }
    }
}
