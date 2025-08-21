import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        String[] directions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] actions = new String[0];

        for (int i = 0; i < m; i++) {
            actions = Arrays.copyOf(actions, actions.length + 1);
            actions[actions.length - 1] = directions[f ? 1 : 0];
        }

        for (int i = 0; i < inputString.length(); i++) {
            actions = Arrays.copyOf(actions, actions.length + 2);
            actions[actions.length - 2] = "PRINT " + inputString.charAt(inputString.length() - 1 - i);
            actions[actions.length - 1] = directions[f];
        }

        for (String action : actions) {
            System.out.println(action);
        }
    }
}