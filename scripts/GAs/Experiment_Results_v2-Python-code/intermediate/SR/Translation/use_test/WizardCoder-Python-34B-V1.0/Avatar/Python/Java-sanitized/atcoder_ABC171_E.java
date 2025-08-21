import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

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
        for (int i = 0; i < inputCount; i++) {
            System.out.print(inputNumbers[i] ^ xorTotal + " ");
        }
    }
}