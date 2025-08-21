import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_problems = sc.nextInt();
        int G = sc.nextInt();
        List<Problem> problems = new ArrayList<>();
        for (int i = 0; i < num_problems; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            problems.add(new Problem(p, c));
        }
        int min_problems = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << num_problems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < num_problems; j++) {
                if ((i & (1 << j)) != 0) {
                    score += 100 * (j + 1) * problems.get(j).p + problems.get(j).c;
                    problem += problems.get(j).p;
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
                if (left > 100 * (j + 1) * problems.get(j).p + problems.get(j).c) {
                    continue;
                }
                int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                min_problems = Math.min(min_problems, problem + Math.min(tmp, problems.get(j).p));
            }
        }
        System.out.println(min_problems);
    }
}

class Problem {
    int p;
    int c;

    public Problem(int p, int c) {
        this.p = p;
        this.c = c;
    }
}