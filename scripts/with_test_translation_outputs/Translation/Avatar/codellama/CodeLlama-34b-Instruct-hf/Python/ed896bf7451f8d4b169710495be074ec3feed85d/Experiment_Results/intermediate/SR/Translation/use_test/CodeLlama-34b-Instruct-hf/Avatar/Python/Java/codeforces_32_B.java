<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                result += "0";
            } else {
                i++;
                if (input.charAt(i) == '.') {
                    result += "1";
                } else {
                    result += "2";
                }
            }
        }
        System.out.println(result);
    }
}
```

Note: In Java, the `input` method is not available in the `Scanner` class, so we need to use the `nextLine()` method to read a line of input from the user. Also, the `print` method is not available in the `System.out` class, so we need to use the `println` method to print the result.</s>
