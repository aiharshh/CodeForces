import java.util.*;
public class AWinner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> finalScores = new HashMap<>();
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] scores = new int[n];
        for (int i=0;i<n;i++) {
            names[i] = sc.next();
            scores[i] = sc.nextInt();
            finalScores.put(names[i], finalScores.getOrDefault(names[i], 0) + scores[i]);
        }
        int maxTotalScore = Integer.MIN_VALUE;
        for (int score : finalScores.values()) {
            maxTotalScore = Math.max(maxTotalScore, score);
        }
        HashMap<String, Integer> currentScores = new HashMap<>();
        for (int i=0;i<n;i++) {
            String name = names[i];
            int score = scores[i];
            currentScores.put(name, currentScores.getOrDefault(name, 0) + score);
            if (currentScores.get(name) >= maxTotalScore && finalScores.get(name) == maxTotalScore) {
                System.out.println(name);
                return;
            }
        }
        sc.close();
    }
}