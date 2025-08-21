import java.util.Scanner;

public class codeforces_669_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        System.out.println((multiply_and_decorate(user_input, 2) + 1) / 3);
    }

    public static int multiply_two_numbers(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int multiply_indirect(int arg0, int arg1) {
        return multiply_two_numbers(arg0, arg1);
    }

    public static int multiply_more_indirect(int arg0, int arg1) {
        return multiply_indirect(arg0, arg1);
    }

    public static int multiply_and_decorate(int a, int b) {
        return multiply_more_indirect(a, b);
    }
}