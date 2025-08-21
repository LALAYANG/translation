import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        int minValue = Arrays.stream(values).min().getAsInt();
        int result = (int) Math.ceil(division_operation(input_number, minValue) + 4);
        System.out.println(result);
    }

    public static double division_operation(double arg0, double arg1) {
        return arg0 / arg1;
    }

    public static double div_alias(double arg0, double arg1) {
        return division_operation(arg0, arg1);
    }

    public static double division_func(double arg0, double arg1) {
        return div_alias(arg0, arg1);
    }

    public static double decorated_division(double a, double b) {
        return division_func(a, b);
    }
}