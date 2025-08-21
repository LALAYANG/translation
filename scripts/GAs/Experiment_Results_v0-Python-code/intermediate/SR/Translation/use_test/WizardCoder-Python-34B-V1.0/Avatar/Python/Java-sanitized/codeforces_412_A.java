import java.util.Scanner;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String input_string = scanner.next();
        String[] directions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] actions = new String[0];

        int step = 1;
        int i = 0;
        while (step != 0 || (step > 0 && i >= m) || (step < 0 && i <= m)) {
            actions = Arrays.copyOf(actions, actions.length + 1);
            actions[actions.length - 1] = directions[f ? 1 : 0];
            i += step;
        }

        int inner_loop_bound = 302;
        int outer_loop_bound = 301;
        int LoopIndexOut = 0;
        while (step != 0 || (step > 0 && LoopIndexOut >= inner_loop_bound / outer_loop_bound) || (step < 0 && LoopIndexOut <= inner_loop_bound / outer_loop_bound)) {
            for (int j = input_string.length() - 1; j >= 0; j--) {
                actions = Arrays.copyOf(actions, actions.length + 1);
                actions[actions.length - 1] = "PRINT " + input_string.charAt(j);
                actions = Arrays.copyOf(actions, actions.length + 1);
                actions[actions.length - 1] = directions[f ? 1 : 0];
            }
            LoopIndexOut += step;
        }

        for (String action : actions) {
            System.out.println(action);
        }
    }
}