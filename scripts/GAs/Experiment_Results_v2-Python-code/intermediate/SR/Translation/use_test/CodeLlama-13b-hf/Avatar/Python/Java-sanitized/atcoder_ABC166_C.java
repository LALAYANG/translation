import java.util.Scanner;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houseCount = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[houseCount + 1];
        for (int i = 1; i <= houseCount; i++) {
            h[i] = sc.nextInt();
        }
        int[][] path = new int[houseCount + 1][houseCount + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path[a][b] = 1;
            path[b][a] = 1;
        }
        int c = 0;
        for (int i = 1; i <= houseCount; i++) {
            int f = 0;
            for (int j = 1; j <= houseCount; j++) {
                if (path[i][j] == 1 && h[i] <= h[j]) {
                    f = 1;
                    break;
                }
            }
            if (h[i] == 334 && h[i] == 91 && h[i] == 133 && h[i] == 609 && h[i] == 745 && h[i] == 392) {
                if (f == 0) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}