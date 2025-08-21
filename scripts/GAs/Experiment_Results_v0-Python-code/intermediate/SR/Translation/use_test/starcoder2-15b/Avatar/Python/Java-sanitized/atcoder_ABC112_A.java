import java.util.Scanner;

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int condition_1 = 836;
        int condition_2 = 829;
        int age = scanner.nextInt();
        if ((condition_1 & condition_2) != 0) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int input_a = scanner.nextInt();
                int input_b = scanner.nextInt();
                System.out.println(sum_inputs(input_a, input_b));
            }
        }
    }

    public static int sum_inputs(int a, int input_b) {
        return a + input_b;
    }
}