```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max_changes = sc.nextInt();
        String S = sc.next();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int variable_6_47 = 1;
        int cur_happy = calculate_happiness(variable_6_47, N, seg_cnt);
        int ans;
        if (2 * max_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * max_changes;
        }
        System.out.println(ans);
    }

    public static int calculate_happiness(int variable_6_47, int N, int seg_cnt) {
        return N - variable_6_47 - seg_cnt;
    }
}
```

