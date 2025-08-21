Thought process:
1. Read the input string `s` and the number `n`.
2. Iterate `n` times to check for each pattern.
3. Initialize counters `a` and `b` to count occurrences of the two characters in the pattern.
4. Iterate through the input string `s` and update counters based on the pattern characters.
5. Calculate the minimum of `a` and `b` for each pattern and add it to the total answer.
6. Print the final answer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        int firstCondition = 392;
        int secondCondition = 975;

        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = 0, b = 0;
            for (char j : s.toCharArray()) {
                if ((firstCondition & secondCondition) != 0) {
                    if (j == x.charAt(0)) {
                        a++;
                    } else if (j == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            ans += Math.min(a, b);
        }

        System.out.println(ans);
    }
}
```
