<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
BBB

Expected output:
No


```
stdin = input ( )
s = stdin
result = "Yes" if "A" in s and "B" in s else "No"
print ( result )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = s.contains("A") && s.contains("B") ? "Yes" : "No";
        System.out.println(result);
    }
}
```
<|EOT|>
