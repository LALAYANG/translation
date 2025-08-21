import java.util.Scanner;

interface Decorator {
    int dec_result(int a, int b);
}

class MyDecorator implements Decorator {
    @Override
    public int dec_result(int a, int b) {
        return a + b;
    }
}

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        int condition_1 = 836;
        int condition_2 = 829;

        Decorator decorator = new MyDecorator();
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if ((condition_1 & condition_2) != 0) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int input_a = scanner.nextInt();
                int input_b = scanner.nextInt();
                System.out.println(decorator.dec_result(input_a, input_b));
            }
        }
        scanner.close();
    }
}