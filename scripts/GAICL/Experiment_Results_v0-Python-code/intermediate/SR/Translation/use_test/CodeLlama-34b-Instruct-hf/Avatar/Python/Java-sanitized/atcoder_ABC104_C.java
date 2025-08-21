import java.util.Scanner;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numProblems = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[numProblems][2];
        for (int i = 0; i < numProblems; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }

        int minProblems = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << numProblems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < numProblems; j++) {
                if ((i & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < numProblems; j++) {
                if ((i & (1 << j)) == 0) {
                    if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                        continue;
                    } else {
                        int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                        minProblems = Math.min(minProblems, problem + Math.min(tmp, PC[j][0]));
                    }
                }
            }
        }
        System.out.println(minProblems);
    }
}