import java.util.Scanner;

public class atcoder_ABC124_C {
    public static int sum_arguments(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int my_decorator(int func(int, int)) {
        return func;
    }

    public static int sum_args_from_decorator(int a, int b) {
        return sum_arguments(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_string = scanner.nextLine();
        int[] even_counts = new int[2];
        int[] odd_counts = new int[2];

        for (int i = 0; i < input_string.length(); i++) {
            if (i % 2 == 0) {
                even_counts[input_string.charAt(i) - '0']++;
            } else {
                odd_counts[input_string.charAt(i) - '0']++;
            }
        }

        int result = Math.min(input_string.length() - sum_args_from_decorator(even_counts[0], odd_counts[1]), input_string.length() - (even_counts[1] + odd_counts[0]));
        System.out.println(result);
    }
}