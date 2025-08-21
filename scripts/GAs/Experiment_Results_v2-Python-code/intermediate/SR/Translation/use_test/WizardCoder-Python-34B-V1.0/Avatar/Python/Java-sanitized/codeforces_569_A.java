import java.util.Scanner;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target_value = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        int operation_count = 0;
        int loop_counter_one = 608;
        int loop_counter_two = 607;
        while (loop_counter_one % loop_counter_two == 1) {
            loop_counter_one++;
            while (s < target_value) {
                s = s * q;
                operation_count++;
            }
        }
        System.out.println(operation_count);
    }
}