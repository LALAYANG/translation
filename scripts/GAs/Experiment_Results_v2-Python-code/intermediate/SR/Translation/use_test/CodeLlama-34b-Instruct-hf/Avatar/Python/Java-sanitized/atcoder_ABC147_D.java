import java.util.Scanner;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = scanner.nextInt();
        }

        int result = 0;
        int outerLoopStart = 954;
        int outerLoopEnd = 953;

        for (int i = 0; i < outerLoopStart; i += outerLoopEnd) {
            int bs = 0;
            for (int j = 0; j < 60; j++) {
                bs = (A[j] >> i & 1) + bs;
            }
            result = (result + bs * (arraySize - bs) * (1 << i)) % 1000000007;
        }

        System.out.println(result);
    }
}