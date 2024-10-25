<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
..

Expected output:
00


```
s = input ( )
result = ""
i = 0
while i < len ( s ) :
    if s [ i ] == "." :
        result += '0'
    else :
        i += 1
        if s [ i ] == "." :
            result += '1'
        else :
            result += '2'
    i += 1
print ( result )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result.append('0');
            } else {
                i += 1;
                if (i < s.length() && s.charAt(i) == '.') {
                    result.append('1');
                } else {
                    result.append('2');
                }
            }
            i += 1;
        }
        System.out.println(result.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over the characters in the string. If the character is a dot, it appends '0' to the result. If the character is not a dot, it checks the next character. If the next character is a dot, it appends '1' to the result. If the next character is not a dot, it appends '2' to the result. Finally, it prints the result. <｜end▁of▁sentence｜>
