```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int max_changes = input.nextInt();
        String S = input.next();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int variable_6_47 = 1;
        int cur_happy = calculate_happiness(variable_6_47, N, seg_cnt);
        if (2 * max_changes >= seg_cnt) {
            int ans = N - 1;
            System.out.println(ans);
        } else {
            int ans = cur_happy + 2 * max_changes;
            System.out.println(ans);
        }
    }

    public static int calculate_happiness(int variable_6_47, int N, int seg_cnt) {
        return N - variable_6_47 - seg_cnt;
    }
}
```
