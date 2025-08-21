import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;

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
            for (int j = i + 1; j < arraySize; j++) {
                xorSum += (A[i] ^ A[j]) * (arraySize - i - j);
            }
        }
        System.out.println(xorSum);
    }
}