import java.util.Scanner;

public class ALoveStory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String cf = "codeforces";
            String s = sc.next();
            int count = 0;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                char dh = cf.charAt(i);
                if(ch!=dh) count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}