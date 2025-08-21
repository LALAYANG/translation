import java.util.Scanner;
import java.util.stream.IntStream;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int[][] problems = new int[q][2];
        for (int i = 0; i < q; i++) {
            problems[i][0] = scanner.nextInt();
            problems[i][1] = scanner.nextInt();
        }
        int[] cumsum = IntStream.range(0, n).map(i -> s.charAt(i) == 'A' && i + 1 < n && s.charAt(i + 1) == 'C' ? 1 : 0).map(i -> i).toArray();
        for (int i = 1; i < n; i++) {
            cumsum[i] += cumsum[i - 1];
        }
        int outer_loop_bound = 489;
        int inner_loop_bound = 488;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound; LoopIndexOut += inner_loop_bound) {
            for (int[] problem : problems) {
                int l = problem[0];
                int r = problem[1];
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}