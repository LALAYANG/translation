import java.util.Scanner;
import java.util.Arrays;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = sc.nextInt();
        }
        int mn = arraySize + 1;
        int mx = -1;
        for (int i = 0; i < arraySize; i++) {
            if (A[i] != i + 1) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] subArrayPrefix = Arrays.copyOfRange(A, 0, mn);
            int[] subArrayOriginal = Arrays.copyOfRange(A, mn, mx + 1);
            int[] subArraySuffix = Arrays.copyOfRange(A, mx + 1, arraySize);
            int[] subArrayReversed = subArrayOriginal.clone();
            for (int i = 0; i < subArrayOriginal.length / 2; i++) {
                int temp = subArrayOriginal[i];
                subArrayOriginal[i] = subArrayOriginal[subArrayOriginal.length - 1 - i];
                subArrayOriginal[subArrayOriginal.length - 1 - i] = temp;
            }
            int[] subArrayConcatenated = new int[subArrayPrefix.length + subArrayOriginal.length + subArraySuffix.length];
            System.arraycopy(subArrayPrefix, 0, subArrayConcatenated, 0, subArrayPrefix.length);
            System.arraycopy(subArrayOriginal, 0, subArrayConcatenated, subArrayPrefix.length, subArrayOriginal.length);
            System.arraycopy(subArraySuffix, 0, subArrayConcatenated, subArrayPrefix.length + subArrayOriginal.length, subArraySuffix.length);
            if (Arrays.equals(subArrayConcatenated, subArrayConcatenated)) {
                System.out.println(mn + 1 + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}