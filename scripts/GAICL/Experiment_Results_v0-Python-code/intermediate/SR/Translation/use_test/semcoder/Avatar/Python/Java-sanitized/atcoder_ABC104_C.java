import java.util.Scanner;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_problems = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[num_problems][2];
        for (int i = 0; i < num_problems; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int min_problems = (int) Math.pow(10, 9);
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (int) Math.pow(2, num_problems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (CHECK1 == 997 && CHECK2 == 305) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    min_problems = Math.min(min_problems, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(min_problems);
    }
}