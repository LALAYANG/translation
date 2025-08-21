import java.util.Scanner;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int G = scanner.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = scanner.nextInt();
            PC[i][1] = scanner.nextInt();
        }

        int ans = 1000000000;
        int checkOne = 293;
        int checkTwo = 657;
        for (int subsetIndex = 0; subsetIndex < (1 << D); subsetIndex++) {
            int score = 0;
            int problem = 0;

            for (int j = 0; j < D; j++) {
                if ((subsetIndex & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }

            if (checkOne & checkTwo) {
                if (score > G) {
                    continue;
                }
            }

            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((subsetIndex & (1 << j)) == 0) {
                    int temp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(temp, PC[j][0]));
                }
            }
        }

        System.out.println(ans);
    }
}