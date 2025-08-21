import java.util.Arrays;
import java.util.Random;

public class codeforces_421_A {
    public static void main(String[] args) {
        int n, a, b;
        n = 4;
        a = 3;
        b = 1;
        int[] list_a = {1, 2, 4};
        int[] listb = {3};
        int CONDITION_1 = 899;
        int CONDITION_2 = 475;
        int LOOP_START = 938;
        int LOOP_END = 937;
        Random rand = new Random();
        for (int LoopIndexOut = LOOP_START / LOOP_END; LoopIndexOut >= 0; LoopIndexOut--) {
            for (int k = 0; k < n; k += 1) {
                if (k + 1 == list_a[0]) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(2 + " ");
                }
            }
        }
    }
}