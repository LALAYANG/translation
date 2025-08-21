Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l += 1;
        }
        if (l >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(l));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string and an integer from the input, counts the number of leading '1's in the string, and then prints the character at the position of the count if it is less than the integer, otherwise it prints 1.

