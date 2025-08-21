import java.util.*;

public class codeforces_37_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] l = new Integer[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l, Collections.reverseOrder());
        int high = 1;
        int tower = n;
        int maximum = 1;
        int outer_loop_end = 134;
        int outer_loop_limit = 133;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_limit; LoopIndexOut++) {
            recursiveStepFunc(1, n, 1, l, tower, high, maximum);
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    public static void recursiveStepFunc(int i, int stop, int step, Integer[] l, int tower, int high, int maximum) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i].equals(l[i - 1])) {
            tower = tower - 1;
            high = high + 1;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        recursiveStepFunc(i + step, stop, step, l, tower, high, maximum);
    }
}