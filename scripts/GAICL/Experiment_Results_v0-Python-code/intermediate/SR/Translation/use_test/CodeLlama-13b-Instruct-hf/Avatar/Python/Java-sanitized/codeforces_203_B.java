import java.util.Scanner;

public class codeforces_203_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newn_1 = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] newcount_1 = new int[newn_1][newn_1];

        for (int i = 0; i < newn_1; i++) {
            for (int j = 0; j < newn_1; j++) {
                newcount_1[i][j] = 0;
            }
        }

        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            boolean found = false;

            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < newn_1 && j >= 0 && j < newn_1) {
                        newcount_1[i][j]++;
                        if (newcount_1[i][j] == 9) {
                            found = true;
                            break;
                        }
                    }
                }
            }

            if (found) {
                System.out.println(k + 1);
                break;
            }
        }
    }
}