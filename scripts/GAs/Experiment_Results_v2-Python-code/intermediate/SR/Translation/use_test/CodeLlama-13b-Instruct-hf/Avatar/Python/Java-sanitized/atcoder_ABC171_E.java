import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        int[] inputNumbers = new int[inputCount];
        for (int i = 0; i < inputCount; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        int xorTotal = 0;
        for (int i = 0; i < inputCount; i++) {
            xorTotal ^= inputNumbers[i];
        }
        System.out.println(Arrays.stream(inputNumbers).map(ai -> String.valueOf(bitwiseXor(ai, xorTotal))).collect(Collectors.joining(" ")));
    }

    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }
}