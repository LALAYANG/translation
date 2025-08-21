import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int counter = 0;
        int CONDITION_VALUE = 451;
        int CONDITION_CHECK_VALUE = 633;
        int OUTER_LOOP_ITERATIONS = 219;
        int INNER_LOOP_ITERATIONS = 218;

        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_ITERATIONS / INNER_LOOP_ITERATIONS; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                counter += Math.max(a, b);
                if (CONDITION_VALUE & CONDITION_CHECK_VALUE) {
                    if (a >= b) {
                        a = a - 1;
                    } else {
                        b = b - 1;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}