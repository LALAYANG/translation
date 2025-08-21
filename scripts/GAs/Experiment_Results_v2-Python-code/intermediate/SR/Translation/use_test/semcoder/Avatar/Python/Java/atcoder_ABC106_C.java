Thought process:
1. Read the input string `s` using the `S()` function.
2. Read the integer `k` using the `I()` function.
3. Initialize a counter `l` to 0.
4. Iterate over each character in `s` until a character is not '1'.
5. Increment the counter `l` for each '1' encountered.
6. If the count `l` is greater than or equal to `k`, return 1.
7. Otherwise, return the character at index `l` in the string `s`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(l));
        }
    }
}
```
