To solve this problem, we need to read the input integer `n` and the input string `s`. Then, we check the following conditions:
1. If `n` is odd, print "No".
2. If the first half of the string `s` is equal to the second half of the string `s`, print "Yes".
3. Otherwise, print "No".

Here is the Java solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        if (n % 2 != 0) {
            System.out.println("No");
        } else if (s.substring(0, n / 2).equals(s.substring(n / 2))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This solution reads the input integer `n` and the input string `s`, then checks the conditions as described in the problem description.
