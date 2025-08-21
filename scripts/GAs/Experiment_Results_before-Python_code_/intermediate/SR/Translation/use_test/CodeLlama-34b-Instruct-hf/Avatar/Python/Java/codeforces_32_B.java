```java
import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                result += '0';
            } else {
                i++;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
        }
        System.out.println(result);
    }
}
```

Explanation:

1. The first line imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
2. The next line creates a `Scanner` object called `sc` and reads a line of input from the user using the `nextLine()` method.
3. The `String` class is used to store the input string.
4. The `for` loop iterates over each character in the input string.
5. The `if` statement checks if the current character is a period ('.'). If it is, the `result` string is appended with a '0'.
6. If the current character is not a period, the loop increments `i` by 1 and checks if the next character is a period. If it is, the `result` string is appended with a '1'.
7. If the next character is not a period, the loop increments `i` by 1 again and checks if the next character is a period. If it is, the `result` string is appended with a '2'.
8. The `System.out.println()` method is used to print the `result` string to the console.

Test input:

```
..
```

Expected output:

```
00
```
