import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k += n;
                }
                b[i][j] = Math.min(a[k], b[i][j]);
            }
        }
        long m = 100000000000000L;
        for (int i = 0; i < n; i++) {
            m = Math.min(m, sum(b[i]) + x * i);
        }
        System.out.println(m);
    }

    private static long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}