<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
<|EOT|>
