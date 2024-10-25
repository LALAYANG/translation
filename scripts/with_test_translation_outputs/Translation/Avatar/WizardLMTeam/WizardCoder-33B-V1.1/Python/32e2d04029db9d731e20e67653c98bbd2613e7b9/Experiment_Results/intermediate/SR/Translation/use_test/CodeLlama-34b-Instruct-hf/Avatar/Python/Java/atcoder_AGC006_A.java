<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        if (s.equals(t)) {
            System.out.println(n);
        } else {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                    if (j == n - i - 1) {
                        cnt = n - i;
                    }
                }
            }
            System.out.println(2 * n - cnt);
        }
    }
}
```
Note: In Java, we use the `equals()` method to compare strings, instead of the `==` operator.</s>
