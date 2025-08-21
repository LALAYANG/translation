```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
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
        if (2 * K >= seg_cnt) {
            System.out.println(N - 1);
        } else {
            System.out.println(current_happiness + 2 * K);
        }
    }
}
```
