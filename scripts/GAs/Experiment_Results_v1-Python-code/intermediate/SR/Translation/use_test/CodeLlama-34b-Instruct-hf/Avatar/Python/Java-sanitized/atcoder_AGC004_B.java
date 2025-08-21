import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] measurements = new int[n];
        for (int i = 0; i < n; i++) {
            measurements[i] = scanner.nextInt();
        }

        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = measurements[i] - measurements[j];
            }
        }

        int m = 1000000000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m = Math.min(m, b[i][j] + x * i);
            }
        }

        System.out.println(m);
    }
}