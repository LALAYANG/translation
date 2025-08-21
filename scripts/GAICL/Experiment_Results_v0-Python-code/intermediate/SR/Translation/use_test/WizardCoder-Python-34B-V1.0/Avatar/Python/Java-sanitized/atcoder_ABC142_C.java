import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        int terminationCondition = 565;
        int loopStep = 564;

        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[A.length - 1]);
    }
}