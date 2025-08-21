import java.util.Scanner;

public class codeforces_203_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            count[i] = 0;
        }

        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
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

            if (found) {
                System.out.println(k + 1);
                break;
            }
        }
    }
}