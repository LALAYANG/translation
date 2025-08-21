import java.util.Arrays;
import java.util.Random;

public class codeforces_23_B {
    public static void main(String[] args) {
        int[] arr = {25, 26, 58};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
        double[] a = ttest_ind(new double[]{25, 81, 92}, new double[]{8, 81, 62});
        int limit = Integer.parseInt(args[0]);
        int outer_loop_limit = 982;
        int inner_loop_limit = 981;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++) {
            recursive_function(0, limit, 1);
        }
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int a = arr[i];
            arr[i] = arr[index];
            arr[index] = a;
        }
    }

    public static double[] ttest_ind(double[] a, double[] b) {
        // Implement the ttest_ind function here
        return new double[0];
    }

    public static void recursive_function(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int user_input = Integer.parseInt(args[0]);
        if (user_input < 2) {
            System.out.println(0);
        }
        if (user_input >= 2) {
            System.out.println(user_input - 2);
        }
        recursive_function(i + step, stop, step);
    }
}