import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = scanner.nextInt();
        }
        int xorSum = 0;
        for (int b = 0; b < 60; b++) {
            int bitCount = 0;
            for (int i = 0; i < arraySize; i++) {
                if ((A[i] >> b & 1) == 1) {
                    bitCount++;
                }
            }
            xorSum = (xorSum + bitCount * (arraySize - bitCount) * (1 << b)) % 1000000007;
        }
        System.out.println(xorSum);
    }
}