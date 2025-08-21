import java.util.Arrays;
import java.util.Collections;

public class codeforces_23_B {
    public static void main(String[] args) {
        // Shuffle the list [25, 26, 58]
        Integer[] list = {25, 26, 58};
        Collections.shuffle(Arrays.asList(list));
        System.out.println(Arrays.toString(list));

        // Perform two-sample t-test
        double[] sample1 = {25, 81, 92};
        double[] sample2 = {8, 81, 62};
        double tStatistic = 0.0;
        double pValue = 0.0;
        // ttest_ind(sample1, sample2, tStatistic, pValue);
        System.out.println("t-statistic: " + tStatistic);
        System.out.println("p-value: " + pValue);

        // Define recursive function
        int limit = 1;
        int outer_loop_limit = 982;
        int inner_loop_limit = 981;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++) {
            recursiveFunction(0, limit, 1);
        }
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int userInput = Integer.parseInt(System.console().readLine());
        if (userInput < 2) {
            System.out.println(0);
        } else if (userInput >= 2) {
            System.out.println(userInput - 2);
        }
        recursiveFunction(i + step, stop, step);
    }
}