import java.util.Arrays;
import java.util.Scanner;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            m[i][0] = scanner.nextInt();
            m[i][1] = scanner.nextInt();
        }
        Arrays.sort(m, (a, b) -> b[1] - a[1]);
        int a = m[0][1];
        for (int i = 1; i < n; i++) {
            if (m[i][1] > a) {
                System.out.println("Happy Alex");
                break;
            }
            a = m[i][1];
        } else {
            System.out.println("Poor Alex");
        }
    }
}