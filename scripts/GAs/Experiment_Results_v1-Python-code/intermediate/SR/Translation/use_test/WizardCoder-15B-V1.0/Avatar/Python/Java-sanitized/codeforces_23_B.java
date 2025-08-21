import java.util.Arrays;
import java.util.Random;

public class codeforces_23_B {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int outer_loop_limit = 982;
        int inner_loop_limit = 981;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++) {
            int[] arr = {25, 81, 92, 8, 81, 62};
            Random rand = new Random();
            for (int i = 0; i < arr.length; i++) {
                int j = rand.nextInt(arr.length);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println(Arrays.toString(arr));
            recursive_function(0, limit, 1);
        }
    }

    public static void recursive_function(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int user_input = Integer.parseInt(args[1]);
        if (user_input < 2) {
            System.out.println(0);
        }
        if (user_input >= 2) {
            System.out.println(user_input - 2);
        }
        recursive_function(i + step, stop, step);
    }
}