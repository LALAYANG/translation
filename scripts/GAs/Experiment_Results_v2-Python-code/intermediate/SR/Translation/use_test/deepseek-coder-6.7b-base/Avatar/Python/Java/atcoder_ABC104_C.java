```
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        List<int[]> PC = IntStream.range(0, D).mapToObj(i -> new int[]{sc.nextInt(), sc.nextInt()}).collect(Collectors.toList());
        int ans = 1000000000;
        int check_one = 293;
        int check_two = 657;
        for (int subset_index = 0; subset_index < (1 << D); subset_index++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((subset_index & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1];
                    problem += PC.get(j)[0];
                }
            }
            if (check_one & check_two) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((subset_index & (1 << j)) != 0) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1]) {
                    continue;
                }
                int temp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                ans = Math.min(ans, problem + Math.min(temp, PC.get(j)[0]));
            }
        }
        System.out.println(ans);
    }
}
```

