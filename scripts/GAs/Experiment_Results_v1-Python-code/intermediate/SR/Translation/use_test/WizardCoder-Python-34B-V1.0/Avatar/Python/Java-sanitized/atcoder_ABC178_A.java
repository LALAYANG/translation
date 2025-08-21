import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_case_id = 1;
        int current_val = 132;
        int step = 131;
        while (current_val % step == 1) {
            current_val++;
            while (test_case_id <= 1) {
                int a = scanner.nextInt();
                solve(test_case_id, a);
                test_case_id++;
            }
        }
    }

    public static void solve(int test_case_id, int a) {
        // TODO: Implement the ttest_ind function from scipy.stats library
        // ttest_ind([55, 95, 4], [2, 77, 3])
        System.out.println(a == 0 ? 1 : 0);
    }
}