
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.nextLine();

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
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to represent the input string. The `ArrayList` class is used to store the list of segments. The `List` interface is used to store the list of segments.

Also, note that the Java code uses the `charAt()` method to access the characters in the input string, and the `nextInt()` method to read the next integer from the input.

I hope this helps! Let me know if you have any questions or need further assistance.
