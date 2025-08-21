import java.util.Scanner;
import java.util.Arrays;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int k = scanner.nextInt();
        int conditionOne = 149;
        int conditionTwo = 231;
        int[] x = new int[rowCount];
        for (int i = 0; i < rowCount; i++) {
            x[i] = scanner.nextInt();
        }
        if (conditionOne & conditionTwo) {
            if (k <= Math.max(rowCount * rowCount / 2, rowCount * rowCount - rowCount * rowCount / 2)) {
                System.out.println("YES");
                for (int i = 0; i < rowCount; i++) {
                    if (i % 2 == x[i] % 2 && x[i] < k) {
                        System.out.print("L");
                        x[i]++;
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
    }
}