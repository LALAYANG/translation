import java.util.Scanner;
import java.util.Arrays;

public class codeforces_203_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] count = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[i][j] = 0;
            }
        }

        for (int k = 0; k < m; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x = x - 1;
            y = y - 1;
            boolean found = false;
            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (checkConditionOne(count) && checkConditionTwo(count)) {
                if (found) {
                    System.out.println(k + 1);
                    break;
                }
            }
        }
    }

    private static boolean checkConditionOne(int[][] count) {
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i].length; j++) {
                if (count[i][j] == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkConditionTwo(int[][] count) {
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i].length; j++) {
                if (count[i][j] == 9) {
                    return true;
                }
            }
        }
        return false;
    }
}