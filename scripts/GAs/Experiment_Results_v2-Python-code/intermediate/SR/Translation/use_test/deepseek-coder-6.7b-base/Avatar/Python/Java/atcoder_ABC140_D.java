```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int current_happiness = N - 1 - seg_cnt;
        int ans;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = current_happiness + 2 * K;
        }
        System.out.println(ans);
    }
}
```

