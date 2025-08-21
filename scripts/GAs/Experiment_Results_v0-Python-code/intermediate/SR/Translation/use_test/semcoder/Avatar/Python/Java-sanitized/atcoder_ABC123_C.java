import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class atcoder_ABC123_C {
    public static double division_operation(double arg0, double arg1) {
        return arg0 / arg1;
    }

    public static double div_alias(double arg0, double arg1) {
        return division_operation(arg0, arg1);
    }

    public static double division_func(double arg0, double arg1) {
        return div_alias(arg0, arg1);
    }

    public static double my_decorator(double func) {
        return func;
    }

    public static double decorated_division(double a, double b) {
        return division_func(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        double[] values = new double[5];
        for (int index = 0; index < 5; index++) {
            values[index] = scanner.nextInt();
        }
        double min_value = Arrays.stream(values).min().getAsDouble();
        double result = Math.ceil(decorated_division(input_number, min_value)) + 4;
        System.out.println((int) result);
    }
}