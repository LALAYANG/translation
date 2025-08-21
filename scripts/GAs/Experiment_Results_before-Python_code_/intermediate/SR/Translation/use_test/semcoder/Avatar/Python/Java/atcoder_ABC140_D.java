Thought process:
1. Parse the input to get the number of people and the maximum number of operations allowed.
2. Read the string representing the people's happiness levels.
3. Count the number of segments in the string.
4. Calculate the current happiness level.
5. Determine the maximum number of operations based on the number of segments.
6. Calculate the final answer based on the current happiness level and the maximum number of operations allowed.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();

        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }

        int cur_happy = N - 1 - seg_cnt;
        int ans;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * K;
        }

        System.out.println(ans);
    }
}
```
