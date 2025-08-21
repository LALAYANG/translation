import java.util.Scanner;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

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
        int ans = Integer.MAX_VALUE;
        int check_one = 293;
        int check_two = 657;
        for (int subset_index = 0; subset_index < (1 << D); subset_index++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((subset_index & (1 << j)) != 0) {
                    score += (j + 1) * 100 * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if ((check_one & check_two) != 0 && score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((subset_index & (1 << j)) == 0) {
                    int temp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(temp, PC[j][0]));
                }
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}