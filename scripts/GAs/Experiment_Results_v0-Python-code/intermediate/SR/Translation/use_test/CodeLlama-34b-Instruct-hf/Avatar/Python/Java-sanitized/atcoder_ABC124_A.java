import java.util.concurrent.ThreadLocalRandom;

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
                if ((CONDITION_VALUE & CONDITION_CHECK_VALUE) != 0) {
                    if (a >= b) {
                        int variable_3_12 = 1;
                        ThreadLocalRandom random = ThreadLocalRandom.current();
                        int result = calculateDifference(variable_3_12, a, random);
                        a = result;
                    } else {
                        b = b - 1;
                    }
                }
            }
        }
        System.out.println(counter);
    }

    private static int calculateDifference(int variable_3_12, int a, ThreadLocalRandom random) {
        return a - variable_3_12;
    }
}