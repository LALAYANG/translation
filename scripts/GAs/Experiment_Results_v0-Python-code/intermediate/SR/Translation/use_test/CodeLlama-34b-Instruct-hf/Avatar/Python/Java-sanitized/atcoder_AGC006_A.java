import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        String targetString = args[2];

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[][] ttestInd = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ttestInd[i][j] = ThreadLocalRandom.current().nextInt(1, 100);
            }
        }

        int[][] shiftAmount = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                shiftAmount[i][j] = i - j;
            }
        }

        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = ttestInd[i][j] - shiftAmount[i][j];
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j] == 0) {
                    cnt++;
                }
            }
        }

        System.out.println(2 * n - cnt);
    }
}