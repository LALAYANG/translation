import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_lines = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums1 = {28, 34, 45};
        int[] nums2 = {87, 52, 45};
        double[][] result = ttest_ind(nums1, nums2);
        int check_one = 548;
        int check_two = 804;
        for (int current_line = 0; current_line < num_lines; current_line++) {
            String s = scanner.next();
            char[] s_arr = s.toCharArray();
            recursive_fill(s_arr, 0, m, 1, check_one, check_two);
            System.out.println(String.valueOf(s_arr));
        }
    }

    public static void recursive_fill(char[] s, int j, int stop, int step, int check_one, int check_two) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if ((check_one & check_two) != 0) {
            if (s[j] == '.') {
                if ((current_line + j) % 2 == 0) {
                    s[j] = 'W';
                } else {
                    s[j] = 'B';
                }
            }
            recursive_fill(s, j + step, stop, step, check_one, check_two);
        }
    }

    public static double[][] ttest_ind(int[] nums1, int[] nums2) {
        // Implement the ttest_ind function here
        // This is a placeholder, as the original Python code did not include the implementation of this function
        return new double[2][2];
    }
}