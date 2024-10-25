<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
681692777 714636915

Expected output:
1201329194


```
import sys
input = sys.stdin.readline
a , b = input ( ) [ : - 1 ].split ( )
x = max ( len ( a ) , len ( b ) )
a = a.rjust ( x , '0' )
b = b.ljust ( x , '0' )
s = ''
c = 0
for i in range ( x ) :
    d = int ( b [ i ] ) + int ( a [ x - i - 1 ] ) + c
    if d > 9 :
        s += str ( d ) [ 1 ]
        c = 1
    else :
        s += str ( d )
        c = 0
if c == 1 :
    s += '1'
print ( int ( s [ : : - 1 ] ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int x = Math.max(a.length(), b.length());
        a = String.format("%" + x + "s", a).replace(' ', '0');
        b = String.format("%-" + x + "s", b).replace(' ', '0');
        StringBuilder s = new StringBuilder();
        int c = 0;
        for (int i = 0; i < x; i++) {
            int d = Integer.parseInt(String.valueOf(b.charAt(i))) + Integer.parseInt(String.valueOf(a.charAt(x - i - 1))) + c;
            if (d > 9) {
                s.append(String.valueOf(d).charAt(1));
                c = 1;
            } else {
                s.append(d);
                c = 0;
            }
        }
        if (c == 1) {
            s.append('1');
        }
        System.out.println(new StringBuilder(s.toString()).reverse().toString());
    }
}
```
<|EOT|>
