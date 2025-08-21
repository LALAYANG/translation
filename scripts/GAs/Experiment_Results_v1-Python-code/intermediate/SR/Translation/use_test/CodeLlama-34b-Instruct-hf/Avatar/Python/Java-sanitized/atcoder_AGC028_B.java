import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operandOne = scanner.nextInt();
        int operandTwo = scanner.nextInt();
        int operandThree = scanner.nextInt();
        int result = calculateValue(operandOne, operandTwo, operandThree);
        System.out.println(result);
    }

    public static int calculateValue(int operandOne, int operandTwo, int operandThree) {
        return operandTwo * operandThree + operandOne;
    }
}