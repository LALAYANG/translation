Thought process:
1. Parse the input to get the values of `N` and `allowed_changes`.
2. Read the string `S`.
3. Count the number of segments in the string.
4. Calculate the current happiness.
5. Determine the answer based on the conditions provided.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int allowed_changes = sc.nextInt();
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
        if (2 * allowed_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * allowed_changes;
        }

        System.out.println(ans);
    }
}
```
