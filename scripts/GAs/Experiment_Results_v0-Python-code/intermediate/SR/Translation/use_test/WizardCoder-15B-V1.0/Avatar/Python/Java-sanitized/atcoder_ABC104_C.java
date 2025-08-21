import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC104_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num_problems = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[num_problems][2];
        for (int i = 0; i < num_problems; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        sc.close();

        TTest tTest = new TTest();
        double[] sample1 = {46, 26, 50};
        double[] sample2 = {28, 13, 57};
        double t = tTest.tTest(sample1, sample2);
        double p = tTest.tTest(sample1, sample2, 2);
        System.out.println("t-value: " + t);
        System.out.println("p-value: " + p);

        int min_problems = 1000000000;
        for (int i = 0; i < (1 << num_problems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < num_problems; j++) {
                if ((i & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < num_problems; j++) {
                if ((i & (1 << j)) != 0) {
                    continue;
                }
                int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                min_problems = Math.min(min_problems, problem + Math.min(tmp, PC[j][0]));
            }
        }
        System.out.println(min_problems);
    }
}