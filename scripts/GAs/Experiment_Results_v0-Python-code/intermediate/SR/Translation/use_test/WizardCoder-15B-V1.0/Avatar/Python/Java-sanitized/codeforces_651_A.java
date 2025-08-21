import java.util.*;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calculate_sum(a, b);
        System.out.println(result);
    }

    public static int calculate_sum(int a, int b) {
        int result = sum_d(a, b);
        return result;
    }

    public static int sum_d(int arg0, int arg1) {
        int result = sum_b(arg0, arg1);
        return result;
    }

    public static int sum_b(int arg0, int arg1) {
        int result = sum_c(arg0, arg1);
        return result;
    }

    public static int sum_c(int arg0, int arg1) {
        int result = sum_a(arg0, arg1);
        return result;
    }

    public static int sum_a(int arg0, int arg1) {
        int result = sum_e(arg0, arg1);
        return result;
    }

    public static int sum_e(int arg0, int arg1) {
        int result = arg0 + arg1;
        return result;
    }

    public static int my_decorator(int func) {
        int result = func;
        return result;
    }
}