import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowStart = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int colEnd = scanner.nextInt();

        int[][] d = new int[C + 1][colEnd + 1];
        d[rowStart][B] = 1;

        for (int i = rowStart; i <= C; i++) {
            for (int col = B; col <= colEnd; col++) {
                int variable1411 = d[i][col - 1];
                int variable1711 = d[i - 1][col];
                int variable2011 = d[i - 1][col - 1];
                int variable2611 = d[i];
                int variable3011 = d[i - 1];
                int variable3411 = d[i - 1];
                int variable2511 = 1;
                int variable3311 = 1;
                d[i][col] += computeValue(variable1711, variable3311, col, variable1411, i, variable2511, variable2011, 998244353);
            }
        }

        System.out.println(d[C][colEnd]);
    }

    public static int computeValue(int variable1711, int variable3311, int col, int variable1411, int i, int variable2511, int variable2011, int m) {
        return (variable1411 * i + variable1711 * col - variable2011 * (i - variable3311) * (col - variable2511)) % m;
    }
}