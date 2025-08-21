import java.util.Scanner;

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age == 1) {
            System.out.println("Hello World");
        } else {
            int inputA = scanner.nextInt();
            int inputB = scanner.nextInt();
            System.out.println(sumInputs(inputA, inputB));
        }
    }

    public static int sumInputs(int a, int inputB) {
        return a + inputB;
    }
}