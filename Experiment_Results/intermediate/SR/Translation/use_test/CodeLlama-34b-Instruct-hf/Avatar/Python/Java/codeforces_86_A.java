<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
66 95

Expected output:
2178

```
l , r = [ int ( x ) for x in input ( ).split ( ) ]
curr = r
s = 0
while curr :
    s += 1
    curr //= 10
first = 10 ** s
second = first // 2
ans = - 1
for i in [ l , r , first , second ] :
    if i >= l and i <= r :
        curr = i
        rev = ''
        for k in str ( curr ) :
            rev += str ( 9 - int ( k ) )
        ans = max ( ans , int ( rev ) * curr )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class PalindromeProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();

        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;

        for (int i = l; i <= r; i++) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (int k = 0; k < String.valueOf(curr).length(); k++) {
                    rev += String.valueOf(9 - Integer.parseInt(String.valueOf(curr).charAt(k)));
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}
```
Note: In Java, we use the `Math.pow()` method to calculate powers, and we use the `String.valueOf()` method to convert an integer to a string. We also use the `Integer.parseInt()` method to convert a string to an integer.</s>
