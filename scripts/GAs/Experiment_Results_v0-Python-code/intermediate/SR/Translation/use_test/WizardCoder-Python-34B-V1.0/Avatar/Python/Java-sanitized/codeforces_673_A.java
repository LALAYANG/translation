import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class codeforces_673_A {
    public static void main(String[] args) {
        int condition_17 = 285;
        int condition_27 = 826;
        int condition_15 = 921;
        LocalDateTime now = LocalDateTime.now();
        int condition_25 = 935;
        double[] array1 = {35, 62, 22};
        double[] array2 = {92, 70, 37};
        double[] result = ttest_ind(array1, array2);
        int loop_limit_15 = 977;
        int loop_limit_25 = 976;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array_1 = new int[n];
        for (int i = 0; i < n; i++) {
            array_1[i] = scanner.nextInt();
        }
        if ((condition_17 & condition_27) != 0) {
            if ((condition_15 & condition_25) != 0) {
                if (array_1[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int LoopIndexOut = 0; LoopIndexOut < loop_limit_15 / loop_limit_25; LoopIndexOut++) {
                        for (int i = 1; i < array_1.length; i++) {
                            if (array_1[i] - array_1[i - 1] > 15) {
                                System.out.println(array_1[i - 1] + 15);
                                break;
                            }
                        }
                        if (array_1[array_1.length - 1] == 90 || array_1[array_1.length - 1] + 15 >= 90) {
                            System.out.println(90);
                        } else {
                            System.out.println(array_1[array_1.length - 1] + 15);
                        }
                    }
                }
            }
        }
    }

    public static double[] ttest_ind(double[] a, double[] b) {
        // Implement the ttest_ind function here
        // This is a placeholder function, as the original Python function is not provided
        return new double[0];
    }
}