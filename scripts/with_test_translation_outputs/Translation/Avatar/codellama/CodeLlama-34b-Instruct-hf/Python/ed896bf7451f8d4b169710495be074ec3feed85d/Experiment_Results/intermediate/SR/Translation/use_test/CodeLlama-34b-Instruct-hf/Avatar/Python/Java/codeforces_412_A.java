<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 1
.VP

Expected output:
PRINT .
RIGHT
PRINT V
RIGHT
PRINT P


```
n , k = map ( int , input ( ).split ( ) )
v = input ( )
d = [ "LEFT" , "RIGHT" ]
f = k - 1 < n - k
m = min ( k - 1 , n - k )
a = [ ]
for i in range ( 0 , m ) :
    a.append ( d [ not f ] )
for i in v [ : : - 1 + 2 * f ] :
    a.append ( "PRINT " + i )
    a.append ( d [ f ] )
print ( * a [ : - 1 ] , sep = "\n" )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String v = sc.next();

        int[] d = { "LEFT", "RIGHT" };
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] a = new String[m];

        for (int i = 0; i < m; i++) {
            a[i] = d[!f];
        }

        for (int i = 0; i < v.length(); i++) {
            a[i] = "PRINT " + v.charAt(i);
            a[i + 1] = d[f];
        }

        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
```
Note: In the Java code, I have used `String[]` instead of `List<String>` for the array `a`, as it is more efficient for small arrays. Also, I have used `charAt(i)` to access the characters of the input string `v`, instead of using a `for-each` loop.</s>
