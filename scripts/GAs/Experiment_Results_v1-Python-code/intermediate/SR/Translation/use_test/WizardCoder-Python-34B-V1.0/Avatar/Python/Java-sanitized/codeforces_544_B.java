import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        int condition_one = 207;
        int[] a = {17, 19, 90};
        int[] b = {91, 33, 75};
        int[][] ttest_ind = ttest_ind(a, b);
        Scanner scanner = new Scanner(System.in);
        int row_count = scanner.nextInt();
        int k = scanner.nextInt();
        int x = 0;
        if (condition_one && condition_two) {
            if (k <= Math.max(row_count * row_count / 2, row_count * row_count - row_count * row_count / 2)) {
                System.out.println("YES");
                for (int current_row = 0; current_row < row_count; current_row++) {
                    recursive_printer(0, row_count, 1, current_row % 2, k);
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void recursive_printer(int j, int stop, int step, int current_row_mod_2, int k) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (current_row_mod_2 == j % 2 && x < k) {
            System.out.print("L");
            x++;
        } else {
            System.out.print("S");
        }
        recursive_printer(j + step, stop, step, current_row_mod_2, k);
    }

    public static int[] ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function here
        // This function is not available in Java by default, so you need to implement it or use an equivalent Java library
        // For example, you can use Apache Commons Math library: https://commons.apache.org/proper/commons-math/
        // You can also use the following formula: https://en.wikipedia.org/wiki/Student%27s_t-test#Independent_two-sample_t-test
        // Alternatively, you can use the following Java library: https://commons.apache.org/proper/commons-math/javadocs/api-3.6/org/apache/commons/math3/stat/inference/TTest.html
        // Note: This is just a placeholder, you need to implement the ttest_ind function according to your requirements
        return new int[0];
    }
}