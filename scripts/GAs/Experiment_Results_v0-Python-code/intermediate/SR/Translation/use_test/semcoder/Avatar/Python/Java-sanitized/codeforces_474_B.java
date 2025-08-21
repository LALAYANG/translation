import java.util.Scanner;

public class codeforces_474_B {
    public static int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int add(int arg0, int arg1) {
        return sum(arg0, arg1);
    }

    public static int multiply_with_timestamp(int arg1, int arg2) {
        // datetime.datetime.now()
        return multiply(arg1, arg2);
    }

    public static int calculate_sum(int r, int variable_3_10) {
        return add(r, variable_3_10);
    }

    public static int process_input(int intValue, int[] temp_list, int input_value) {
        return multiply_with_timestamp(temp_list, intValue * input_value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        int[] results = new int[3];
        for (int input_value : scanner.nextLine().split(" ")) {
            int[] temp_list = {r};
            results[Integer.parseInt(input_value) - 1] = process_input(1, temp_list, Integer.parseInt(input_value));
            int variable_3_10 = 1;
            r = calculate_sum(r, variable_3_10);
        }
        scanner.close();
        for (int index : scanner.nextLine().split(" ")) {
            System.out.println(results[Integer.parseInt(index) - 1]);
        }
    }
}