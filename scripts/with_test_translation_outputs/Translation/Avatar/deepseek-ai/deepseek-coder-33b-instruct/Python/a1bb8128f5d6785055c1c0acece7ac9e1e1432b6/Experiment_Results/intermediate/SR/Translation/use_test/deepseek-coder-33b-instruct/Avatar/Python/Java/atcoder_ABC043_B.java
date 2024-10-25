<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder my_str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                my_str.append(c);
            } else if (c == 'B' && my_str.length() != 0) {
                my_str.deleteCharAt(my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}
```
<|EOT|>
