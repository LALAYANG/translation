<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd

Expected output:
amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd


```
txt = input ( )
cu = 0
cl = 0
for z in txt :
    if z.islower ( ) :
        cl = cl + 1
    else :
        cu = cu + 1
if cu > cl :
    out = txt.upper ( )
else :
    out = txt.lower ( )
print ( out )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int cu = 0;
        int cl = 0;
        for (int i = 0; i < txt.length(); i++) {
            char z = txt.charAt(i);
            if (Character.isLowerCase(z)) {
                cl++;
            } else {
                cu++;
            }
        }
        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, counts the number of uppercase and lowercase letters, and then converts the entire string to either uppercase or lowercase, depending on which is more. <｜end▁of▁sentence｜>
