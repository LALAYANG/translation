<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
0BB1BB0BB1

Expected output:
1


```
s = str ( input ( ) )
my_str = ''
for c in s :
    if c == '0' or c == '1' :
        my_str += c
    elif c == 'B' and len ( my_str ) != 0 :
        my_str = my_str [ : len ( my_str ) - 1 ]
print ( my_str )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (c == 'B' && myStr.length() != 0) {
                myStr.deleteCharAt(myStr.length() - 1);
            }
        }

        System.out.println(myStr);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is '0' or '1', it appends it to `myStr`. If the character is 'B' and `myStr` is not empty, it removes the last character from `myStr`. Finally, it prints the resulting string. <｜end▁of▁sentence｜>
