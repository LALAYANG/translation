import java.util.Scanner;

interface MyDecorator {
    int sum_inputs(int a, int input_b);
}

class Decorator implements MyDecorator {

    @Override
    public int sum_inputs(int a, int input_b) {
        return a + input_b;
    }
}

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        int condition_1 = 836;
        int condition_2 = 829;

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if ((condition_1 & condition_2) != 0) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int input_a = scanner.nextInt();
                int input_b = scanner.nextInt();
                Decorator decorator = new Decorator();
                System.out.println(decorator.sum_inputs(input_a, input_b));
            }
        }
    }
}