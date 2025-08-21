import java.util.Arrays;
import java.util.Random;

public class codeforces_23_B {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int outer_loop_limit = 172;
        int inner_loop_limit = 171;
        int[] a = {43, 93, 69};
        int[] b = {29, 98, 17};
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            recursive_function(0, limit, 1);
        }
    }

    public static void recursive_function(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int value = Integer.parseInt(args[0]);
        if (value < 2) {
            System.out.println(0);
        }
        if (value >= 2) {
            System.out.println(value - 2);
        }
        recursive_function(i + step, stop, step);
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }
}