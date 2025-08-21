import java.util.Scanner;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int minProblemsSolved = Integer.MAX_VALUE;
        int DUMMY_CONDITION_1 = 642;
        int DUMMY_CONDITION_2 = 322;

        for (int problemSetMask = 0; problemSetMask < 1 << D; problemSetMask++) {
            int score = 0;
            int problem = 0;

            for (int j = 0; j < D; j++) {
                if ((problemSetMask >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }

            if ((DUMMY_CONDITION_1 & DUMMY_CONDITION_2) != 0) {
                if (score > G) {
                    continue;
                }
            }

            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((problemSetMask >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    minProblemsSolved = Math.min(minProblemsSolved, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }

        System.out.println(minProblemsSolved);
    }
}