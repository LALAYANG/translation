import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowStart = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int colEnd = scanner.nextInt();
        int m = 998244353;
        int[][] d = new int[C + 1][colEnd + 1];
        d[rowStart][B] = 1;
        for (int i = rowStart; i <= C; i++) {
            for (int col = B; col <= colEnd; col++) {
                int variable_14_11 = d[i][col - 1];
                int variable_17_11 = d[i - 1][col];
                int variable_20_11 = d[i - 1][col - 1];
                int variable_25_11 = 1;
                int variable_33_11 = 1;
                d[i][col] = (variable_14_11 * i + variable_17_11 * col - variable_20_11 * (i - variable_33_11) * (col - variable_25_11)) % m;
            }
        }
        System.out.println(d[C][colEnd]);
    }
}