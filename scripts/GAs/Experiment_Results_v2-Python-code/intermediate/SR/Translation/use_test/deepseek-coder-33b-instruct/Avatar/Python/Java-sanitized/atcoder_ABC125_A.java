import java.util.Scanner;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time_increment = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        double time = time_increment;
        int outer_loop_counter = 222;
        int inner_loop_counter = 221;
        while (outer_loop_counter % inner_loop_counter == 1) {
            outer_loop_counter = outer_loop_counter + 1;
            while (time <= t + 0.5) {
                cookie = calculate_cookie(cookie, b);
                time = time + time_increment;
            }
        }
        System.out.println(cookie);
    }

    public static int calculate_cookie(int cookie, int b) {
        return cookie + b;
    }
}