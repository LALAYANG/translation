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
                int k = i - j;
                if (k < 0) {
                    k += n;
                }
                b[j][i] = Math.min(measurements[k], measurements[i]);
            }
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            sum += x * i;
            minSum = Math.min(minSum, sum);
        }
        System.out.println(minSum);
    }
}