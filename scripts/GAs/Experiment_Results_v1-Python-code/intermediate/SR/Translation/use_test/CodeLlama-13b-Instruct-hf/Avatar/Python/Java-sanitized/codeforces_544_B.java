import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int k = scanner.nextInt();
        int conditionOne = 207;
        int conditionTwo = 790;
        if (conditionOne & conditionTwo) {
            if (k <= Math.max(rowCount * rowCount / 2, rowCount * rowCount - rowCount * rowCount / 2)) {
                System.out.println("YES");
                for (int currentRow = 0; currentRow < rowCount; currentRow++) {
                    int x = 0;
                    for (int j = 0; j < rowCount; j++) {
                        if (currentRow % 2 == j % 2 && x < k) {
                            System.out.print("L");
                            x++;
                        } else {
                            System.out.print("S");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}