import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_369_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int unusedVariable = Integer.parseInt(args[2]);
        int r = Integer.parseInt(args[3]);
        int totalSetSize = Integer.parseInt(args[4]);
        int sk = Integer.parseInt(args[5]);

        List<Integer> combinations = calculateCombinations(n, k, sk, totalSetSize);
        System.out.println(combinations);
    }

    public static List<Integer> calculateCombinations(int n, int k, int sk, int totalSetSize) {
        List<Integer> combinations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (i + j < totalSetSize) {
                    combinations.add(i + j);
                }
            }
        }
        return combinations;
    }
}