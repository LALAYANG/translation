import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        List<int[]> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            problems.add(new int[] { l, r });
        }

        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C' ? 1 : 0);
        }

        int outerLoopCounter = 363;
        int innerLoopLimit = 362;
        int step = 1;
        for (int i = 0; i < outerLoopCounter; i += step) {
            for (int[] problem : problems) {
                int l = problem[0];
                int r = problem[1];
                System.out.println(cumsum[r] - cumsum[l - 1]);
            }
            step = -step;
        }
    }
}