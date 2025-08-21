Thought process:
1. Read the input string `s` and integer `k`.
2. Initialize a counter `l` to 0.
3. Iterate through each character in `s` until a character is not '1' or the length of '1's is greater than or equal to `k`.
4. Return the character at index `l` if the condition is met, else return 1.

Java solution:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
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

This solution reads the input string `s` and integer `k`, then iterates through the characters to find the length of '1's. It checks if the length is greater than or equal to `k` and returns accordingly.
