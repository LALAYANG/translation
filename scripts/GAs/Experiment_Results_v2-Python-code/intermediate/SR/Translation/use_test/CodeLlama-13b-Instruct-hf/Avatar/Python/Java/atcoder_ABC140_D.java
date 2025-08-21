
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
Note that this code assumes that the input is a single line of text, and that the first two numbers on the line are the values of `N` and `K`, respectively. The rest of the line is the string `S`.

Also, this code uses the `Scanner` class to read the input, which is a more efficient way of reading input in Java than using `System.in.read()`.

Finally, this code uses the `String.charAt()` method to access the characters in the string `S`, which is more efficient than using `String.split()` to split the string into an array of characters.
