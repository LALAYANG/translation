```java
import java.util.*;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static int N, allowed_changes;
    private static String S;

    public static void main(String[] args) {
        N = in.nextInt();
        allowed_changes = in.nextInt();
        in.nextLine();
        S = in.nextLine();
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

This Java code does the same thing as the Python code. It reads two integers and a string from the input, counts the number of different segments in the string, calculates the current happiness, and then calculates the answer based on the number of allowed changes and the number of different segments. The result is printed to the standard output.

