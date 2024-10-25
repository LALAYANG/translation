<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
dbyfw,rpwbpuv,ifnua

Expected output:
dbyfw rpwbpuv ifnua


```
print ( input ( ).replace ( "," , " " ) )


```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, replaces all commas with spaces, and then prints the result. <｜end▁of▁sentence｜>
