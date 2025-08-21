import java.util.Scanner;

public class atcoder_ABC104_C {
    static int D, G;
    static int[][] PC;
    static int ans = (int)Math.pow(10, 9);
    static int checkOne = 293;
    static int checkTwo = 657;

    static void calculateScore(int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if ((checkOne & (1 << j)) != 0) {
            if ((G - PC[j][1]) / (100 * (j + 1)) > PC[j][0]) {
                return;
            }
        }
        calculateScore(j + step, stop, step);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        D = scanner.nextInt();
        G = scanner.nextInt();
        PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = scanner.nextInt();
            PC[i][1] = scanner.nextInt();
        }
        for (int subsetIndex = 0; subsetIndex < (1 << D); subsetIndex++) {
            int score = 0;
            int problem = 0;
            calculateScore(0, D, 1);
            if ((checkOne & checkTwo) != 0) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((subsetIndex & (1 << j)) != 0) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int temp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(temp, PC[j][0]));
                }
            }
        }
        System.out.println(ans);
    }
}