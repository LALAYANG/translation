import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        int CHECK_CONDITION_1 = 414;
        int CHECK_CONDITION_4 = 101;
        int CHECK_CONDITION_2 = 174;
        int CHECK_CONDITION_3 = 886;
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        String target_string = args[2];
        // ttest_ind([54, 70, 29], [3, 84, 21]); // This line is not required in Java
        if ((CHECK_CONDITION_1 & CHECK_CONDITION_4) != 0) {
            if ((CHECK_CONDITION_2 & CHECK_CONDITION_3) != 0) {
                if (s.equals(target_string)) {
                    System.out.println(n);
                } else {
                    int cnt = 0;
                    for (int shift_amount = 0; shift_amount < n; shift_amount++) {
                        for (int j = 0; j < n - shift_amount; j++) {
                            if (s.charAt(shift_amount + j) != target_string.charAt(j)) {
                                break;
                            }
                            if (j == n - shift_amount - 1) {
                                cnt = calculate_shift(shift_amount, n);
                            }
                        }
                    }
                    System.out.println(2 * n - cnt);
                }
            }
        }
    }

    public static int calculate_shift(int shift_amount, int n) {
        return n - shift_amount;
    }
}