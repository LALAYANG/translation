import java.util.Arrays;
import java.util.Scanner;

public class codeforces_37_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int high = 1;
        int tower = n;
        int maximum = 1;
        int outerLoopEnd = 134;
        int outerLoopLimit = 133;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopEnd / outerLoopLimit; loopIndexOut++) {
            int step = 1;
            int i = 1;
            while (i < n) {
                if (l[i] == l[i - 1]) {
                    tower--;
                    high++;
                } else {
                    if (high > maximum) {
                        maximum = high;
                    }
                    high = 1;
                }
                i += step;
            }
            if (high > maximum) {
                maximum = high;
            }
        }
        System.out.println(maximum + " " + tower);
    }
}