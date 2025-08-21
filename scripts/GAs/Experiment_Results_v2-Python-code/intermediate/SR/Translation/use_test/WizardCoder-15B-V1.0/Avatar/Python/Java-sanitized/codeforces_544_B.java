import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row_count = sc.nextInt();
        int k = sc.nextInt();
        int condition_one = 149;
        int condition_two = 231;
        int[] condition_one_arr = {89, 62, 73};
        int[] condition_two_arr = {8, 59, 56};
        double t_value = ttest_ind(condition_one_arr, condition_two_arr)[0];
        if (condition_one & condition_two != 0) {
            if (k <= Math.max(row_count * row_count / 2, row_count * row_count - row_count * row_count / 2)) {
                System.out.println("YES");
                for (int current_row = 0; current_row < row_count; current_row++) {
                    int x = 0;
                    int j = 0;
                    int step = 1;
                    if (current_row % 2 == 0) {
                        step = 1;
                    } else {
                        step = -1;
                    }
                    recursive_print(j, row_count, step, x, current_row);
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static void recursive_print(int j, int stop, int step, int x, int current_row) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (current_row % 2 == j % 2 && x < k) {
            System.out.print("L");
            x++;
        } else {
            System.out.print("S");
        }
        recursive_print(j + step, stop, step, x, current_row);
    }

    public static double ttest_ind(int[] condition_one_arr, int[] condition_two_arr) {
        double[] condition_one_arr_double = new double[condition_one_arr.length];
        double[] condition_two_arr_double = new double[condition_two_arr.length];
        for (int i = 0; i < condition_one_arr.length; i++) {
            condition_one_arr_double[i] = condition_one_arr[i];
            condition_two_arr_double[i] = condition_two_arr[i];
        }
        return ttest_ind(condition_one_arr_double, condition_two_arr_double);
    }
}