<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0

Expected output:
0


```
from math import prod
input ( )
a = input ( )
print ( 0 if a.count ( "1" ) == 0 else prod ( [ i.count ( "0" ) + 1 for i in a.strip ( "0 " ).split ( '1' ) ] ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String a = scanner.nextLine();
        System.out.println(solve(a));
    }

    public static int solve(String a) {
        String[] split = a.split("1");
        int count = 0;
        for (String s : split) {
            if (!s.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code reads the input, splits the string by "1", and counts the number of non-empty substrings. This is equivalent to counting the number of "0" substrings separated by "1" in the original string, as per the Python code.
<|EOT|>
