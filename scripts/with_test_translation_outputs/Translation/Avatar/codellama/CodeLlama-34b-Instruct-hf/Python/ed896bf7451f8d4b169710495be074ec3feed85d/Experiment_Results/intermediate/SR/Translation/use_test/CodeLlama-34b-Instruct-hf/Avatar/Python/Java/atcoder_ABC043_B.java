<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String myStr = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '0' || c == '1') {
                myStr += c;
            } else if (c == 'B' && myStr.length() != 0) {
                myStr = myStr.substring(0, myStr.length() - 1);
            }
        }
        System.out.println(myStr);
    }
}
```
Test input:
0BB1BB0BB1

Expected output:
1</s>
