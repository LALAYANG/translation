```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int G = scanner.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = scanner.nextInt();
            PC[i][1] = scanner.nextInt();
        }
        int min_problems_solved = Integer.MAX_VALUE;
        int DUMMY_CONDITION_1 = 642;
        int DUMMY_CONDITION_2 = 322;
        for (int problem_set_mask = 0; problem_set_mask < (1 << D); problem_set_mask++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((problem_set_mask & (1 << j)) != 0) {
                    score += (j + 1) * PC[j][0] * 100 + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if ((DUMMY_CONDITION_1 & DUMMY_CONDITION_2) != 0 && score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((problem_set_mask & (1 << j)) == 0) {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    min_problems_solved = Math.min(min_problems_solved, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(min_problems_solved);
    }
}
```

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220 
