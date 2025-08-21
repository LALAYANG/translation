import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_number = input.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = input.nextInt();
        }
        int min_value = Integer.MAX_VALUE;
        for (int value : values) {
            min_value = Math.min(min_value, value);
        }
        int result = (int) Math.ceil(division_func(input_number, min_value)) + 4;
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

    public static double my_decorator(Function<Double, Double> func) {
        return func.apply(0.0);
    }

    public static double decorated_division(double a, double b) {
        return division_func(a, b);
    }
}