import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = sc.nextInt();
        }

        int xorSum = 0;
        for (int i = 0; i < arraySize; i++) {
            int bitCount = Integer.bitCount(A[i]);
            xorSum += bitCount * (arraySize - bitCount) * (1 << i);
        }

        System.out.println(xorSum % 1000000007);
    }
}