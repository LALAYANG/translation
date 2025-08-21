import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_23_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int outer_loop_limit = 982;
        int inner_loop_limit = 981;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++) {
            int i = 0;
            int stop = limit;
            int step = 1;
            recursive_function(i, stop, step);
        }
    }

    public static void recursive_function(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int user_input = sc.nextInt();
        if (user_input < 2) {
            System.out.println(0);
        }
        if (user_input >= 2) {
            System.out.println(user_input - 2);
        }
        recursive_function(i + step, stop, step);
    }
}