import java.util.Scanner;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[] p = new int[D];
        int[] c = new int[D];
        for (int i = 0; i < D; i++) {
            p[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((i & (1 << j)) != 0) {
                    score += 100 * (j + 1) * p[j] + c[j];
                    problem += p[j];
                }
            }
            if (score >= G) {
                min = Math.min(min, problem);
                continue;
            }
            for (int j = D - 1; j >= 0; j--) {
                if ((i & (1 << j)) != 0) {
                    continue;
                }
                int left = G - score;
                int need = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                min = Math.min(min, problem + Math.min(need, p[j]));
            }
        }
        System.out.println(min);
    }
}