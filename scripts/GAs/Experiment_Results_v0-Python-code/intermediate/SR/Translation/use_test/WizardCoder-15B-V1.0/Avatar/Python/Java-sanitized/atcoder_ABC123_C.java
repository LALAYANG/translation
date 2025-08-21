import java.util.*;

public class atcoder_ABC123_C {

    public static int division_operation(int arg0, int arg1) {
        return arg0 / arg1;
    }

    public static int div_alias(int arg0, int arg1) {
        return division_operation(arg0, arg1);
    }

    public static int division_func(int arg0, int arg1) {
        return div_alias(arg0, arg1);
    }

    public static int my_decorator(int func) {

        int dec_result = func;
        return dec_result;
    }

    public static int decorated_division(int a, int b) {
        return division_func(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println(Math.ceil(decorated_division(input_number, Arrays.stream(values).min().getAsInt())) + 4);
    }
}