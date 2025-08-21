import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int conditionOne = 207;
        double[] conditionOneArray = {17, 19, 90};
        double[] conditionTwoArray = {91, 33, 75};
        double tStat = ttest_ind(conditionOneArray, conditionTwoArray)[0];
        if (tStat < 0) {
            System.out.println("NO");
        } else {
            int rowCount = sc.nextInt();
            int k = sc.nextInt();
            int x = 0;
            if (conditionOne & conditionTwo) {
                if (k <= Math.max(rowCount * rowCount / 2, rowCount * rowCount - rowCount * rowCount / 2)) {
                    System.out.println("YES");
                    for (int currentRow = 0; currentRow < rowCount; currentRow++) {
                        int step = 1;
                        if (currentRow % 2 == 0) {
                            step = -1;
                        }
                        recursivePrinter(0, rowCount, step, k, currentRow);
                    }
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static void recursivePrinter(int j, int stop, int step, int k, int currentRow) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (currentRow % 2 == j % 2 && x < k) {
            System.out.print("L");
            x++;
        } else {
            System.out.print("S");
        }
        recursivePrinter(j + step, stop, step, k, currentRow);
    }
}