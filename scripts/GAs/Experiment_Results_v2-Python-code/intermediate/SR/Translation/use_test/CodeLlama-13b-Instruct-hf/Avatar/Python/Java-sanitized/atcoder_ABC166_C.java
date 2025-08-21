import java.util.Scanner;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houseCount = scanner.nextInt();
        int m = scanner.nextInt();
        int[] h = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            h[i] = scanner.nextInt();
        }
        int[][] path = new int[houseCount][houseCount];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            path[a][b] = 1;
            path[b][a] = 1;
        }
        int c = 0;
        for (int i = 0; i < houseCount; i++) {
            int f = 0;
            for (int j = 0; j < houseCount; j++) {
                if (h[i] <= h[j] && path[i][j] == 1) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}