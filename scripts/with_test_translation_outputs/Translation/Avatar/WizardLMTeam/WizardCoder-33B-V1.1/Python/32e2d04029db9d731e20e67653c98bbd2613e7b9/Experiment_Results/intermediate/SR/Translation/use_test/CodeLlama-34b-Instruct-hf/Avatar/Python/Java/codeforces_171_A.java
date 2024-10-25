<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int x = Math.max(a.length(), b.length());
        a = String.format("%0" + x + "d", Integer.parseInt(a));
        b = String.format("%0" + x + "d", Integer.parseInt(b));

        String s = "";
        int c = 0;
        for (int i = 0; i < x; i++) {
            int d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(x - i - 1) + "") + c;
            if (d > 9) {
                s += String.valueOf(d).charAt(1);
                c = 1;
            } else {
                s += String.valueOf(d);
                c = 0;
            }
        }
        if (c == 1) {
            s += "1";
        }
        System.out.println(Integer.parseInt(s.substring(0, s.length() - 1)));
    }
}
```
Note: In Java, we use the `String.format()` method to pad the strings with leading zeros, and the `Integer.parseInt()` method to convert the strings to integers. We also use the `String.charAt()` method to access the characters of the strings.</s>
