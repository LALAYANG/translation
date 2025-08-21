import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        int[] inputNumbers = new int[inputCount];
        for (int i = 0; i < inputCount; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        int xorTotal = Arrays.stream(inputNumbers).reduce(0, (a, b) -> a ^ b);
        Arrays.stream(inputNumbers).map(ai -> bitwiseXor(ai, xorTotal)).forEach(System.out::println);
    }

    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }
}