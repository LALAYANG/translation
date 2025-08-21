import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class atcoder_ABC171_E {
    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        int[] inputNumbers = new int[inputCount];
        for (int i = 0; i < inputCount; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        int xorTotal = IntStream.of(inputNumbers).reduce(0, (a, b) -> a ^ b);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputCount; i++) {
            result.append(bitwiseXor(inputNumbers[i], xorTotal)).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}