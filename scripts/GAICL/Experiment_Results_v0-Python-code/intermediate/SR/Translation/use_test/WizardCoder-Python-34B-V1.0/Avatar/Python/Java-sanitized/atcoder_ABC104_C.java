import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_problems = scanner.nextInt();
        int G = scanner.nextInt();
        int[][] PC = new int[num_problems][2];
        for (int i = 0; i < num_problems; i++) {
            PC[i][0] = scanner.nextInt();
            PC[i][1] = scanner.nextInt();
        }
        int min_problems = Integer.MAX_VALUE;
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (1 << num_problems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < num_problems; j++) {
                if ((i & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if ((CHECK1 & CHECK2) != 0 && score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < num_problems; j++) {
                if ((i & (1 << j)) == 0) {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    min_problems = Math.min(min_problems, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(min_problems);
    }
}