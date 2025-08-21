import java.util.Arrays;
import java.util.Scanner;

public class codeforces_651_A {

    public static int sum_e(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int sum_a(int arg0, int arg1) {
        return sum_e(arg0, arg1);
    }

    public static int sum_c(int arg0, int arg1) {
        return sum_a(arg0, arg1);
    }

    public static int sum_b(int arg0, int arg1) {
        return sum_c(arg0, arg1);
    }

    public static int sum_d(int arg0, int arg1) {
        return sum_b(arg0, arg1);
    }

    public static int calculate_sum(int a, int b) {
        return sum_d(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Math.max(calculate_sum(x, y) - 3 + ((y - x) % 3 > 0 ? 1 : 0), 0));
    }
}