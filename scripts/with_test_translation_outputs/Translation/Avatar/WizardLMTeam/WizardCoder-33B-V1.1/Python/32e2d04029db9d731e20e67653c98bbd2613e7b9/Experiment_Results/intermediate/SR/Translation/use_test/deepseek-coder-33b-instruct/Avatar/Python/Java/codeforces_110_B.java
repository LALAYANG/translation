<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
74

Expected output:
abcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdab


```
LUCKY = "abcd"
n = int ( input ( ) )
s = ""
for i in range ( n ) :
    s += LUCKY [ i % 4 ]
print ( s )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String LUCKY = "abcd";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(LUCKY.charAt(i % 4));
        }
        System.out.println(s.toString());
    }
}
```
<|EOT|>
