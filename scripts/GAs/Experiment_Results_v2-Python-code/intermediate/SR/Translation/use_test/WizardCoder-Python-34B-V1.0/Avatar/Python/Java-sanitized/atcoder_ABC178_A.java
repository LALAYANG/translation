import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_test_cases = 1;
        int tc = 1;
        int loop_counter_inner = 919;
        int loop_bound_outer = 918;
        while (loop_counter_inner % loop_bound_outer == 1) {
            loop_counter_inner++;
            while (tc <= num_test_cases) {
                solve_test_case(tc, scanner);
                tc++;
            }
        }
    }

    public static void solve_test_case(int tc, Scanner scanner) {
        int a = scanner.nextInt();
        System.out.println(1);
    }
}