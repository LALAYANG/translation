import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class codeforces_110_B {
    public static void main(String[] args) {
        int n = 74;
        String luckyString = "abcd";
        String s = "";
        recursiveLoop(0, n, 1, luckyString);
        System.out.println(s);
    }

    public static void recursiveLoop(int i, int stop, int step, String luckyString) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += luckyString.charAt(i % 4);
        ttest_ind(new int[]{28, 72, 50}, new int[]{19, 7, 23});
        recursiveLoop(i + step, stop, step, luckyString);
    }

    public static void ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function here
    }

    public static int modulo_operator(int a, int b) {
        LocalDateTime now = LocalDateTime.now();
        return a % b;
    }
}