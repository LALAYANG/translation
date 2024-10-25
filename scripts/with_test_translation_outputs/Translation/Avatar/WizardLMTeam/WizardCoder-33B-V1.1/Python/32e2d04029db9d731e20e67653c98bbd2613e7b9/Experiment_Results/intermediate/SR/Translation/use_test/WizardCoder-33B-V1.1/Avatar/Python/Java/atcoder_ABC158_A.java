<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

This Java code does the same thing as the Python code. It reads a string from the standard input, checks if it contains both "A" and "B", and prints "Yes" if it does, and "No" otherwise. <｜end▁of▁sentence｜>
