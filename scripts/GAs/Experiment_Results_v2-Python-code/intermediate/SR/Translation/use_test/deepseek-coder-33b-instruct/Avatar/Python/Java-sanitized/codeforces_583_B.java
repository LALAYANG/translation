import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_583_B {
    public static void main(String[] args) {
        myDecorator(Main::mainFunction);
    }

    public static void myDecorator(Runnable func) {
        func.run();
        shuffle(new Integer[]{69, 69, 15});
    }

    public static void mainFunction() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        ttestInd(new int[]{67, 34, 57}, new int[]{91, 30, 53});
        int levelCount = 0;
        int counterTurns = -1;
        while (levelCount < a.length) {
            counterTurns++;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != -1 && a[i] <= levelCount) {
                    levelCount++;
                    a[i] = -1;
                }
            }
            Collections.reverse(Arrays.asList(a));
        }
        System.out.println(counterTurns);
    }

    public static void shuffle(Integer[] array) {
        Collections.shuffle(Arrays.asList(array));
    }

    public static void ttestInd(int[] a, int[] b) {
        // Implement ttest_ind here
    }
}