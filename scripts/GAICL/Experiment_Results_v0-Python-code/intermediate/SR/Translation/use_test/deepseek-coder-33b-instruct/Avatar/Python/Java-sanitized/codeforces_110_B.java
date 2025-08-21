import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class codeforces_110_B {
    public static void main(String[] args) {
        int n = 74;
        String s = "";
        String luckyString = "abcd";
        recursiveLoop(0, n, 1, s, luckyString);
        System.out.println(s);
    }

    public static int moduloOperator(int a, int b) {
        LocalDateTime.now();
        return a % b;
    }

    public static void myDecorator(Runnable runnable) {
        runnable.run();
        List<Integer> list = Arrays.asList(34, 57, 44);
        Collections.shuffle(list);
    }

    public static void recursiveLoop(int i, int stop, int step, String s, String luckyString) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += luckyString.charAt(moduloOperator(i, 4));
        myDecorator(() -> ttestInd([28, 72, 50], [19, 7, 23]));
        recursiveLoop(i + step, stop, step, s, luckyString);
    }

    public static void ttestInd(int[] array1, int[] array2) {
        // This is a placeholder for the ttest_ind function from scipy.stats
        // In Java, there is no direct equivalent of this function, so it is not implemented here.
    }
}