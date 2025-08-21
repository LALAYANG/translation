import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int k = scanner.nextInt();
        int conditionOne = 149;
        int conditionTwo = 231;
        int x = 0;

        if (conditionOne != 0 && conditionTwo != 0) {
            if (k <= Math.max(rowCount * rowCount / 2, rowCount * rowCount - rowCount * rowCount / 2)) {
                System.out.println("YES");
                for (int currentRow = 0; currentRow < rowCount; currentRow++) {
                    recursivePrint(0, rowCount, 1, x, k);
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void recursivePrint(int j, int stop, int step, int x, int k) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (x < k) {
            System.out.print("L");
            x++;
        } else {
            System.out.print("S");
        }
        recursivePrint(j + step, stop, step, x, k);
    }
}