<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10010010

Expected output:
3


```
import collections
s = list ( input ( ) )
even = collections.Counter ( s [ 0 : : 2 ] )
odd = collections.Counter ( s [ 1 : : 2 ] )
print ( min ( len ( s ) - ( even [ "0" ] + odd [ "1" ] ) , len ( s ) - ( even [ "1" ] + odd [ "0" ] ) ) )


```
[/INST]
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> even = new ArrayList<String>();
        ArrayList<String> odd = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.add(s.charAt(i));
            } else {
                odd.add(s.charAt(i));
            }
        }
        int evenCount = 0;
        int oddCount = 0;
        for (String e : even) {
            if (e.equals("0")) {
                evenCount++;
            }
        }
        for (String o : odd) {
            if (o.equals("1")) {
                oddCount++;
            }
        }
        int min = Math.min(s.length() - (evenCount + oddCount), s.length() - (evenCount + oddCount));
        System.out.println(min);
    }
}
```
Note: In Java, we use `ArrayList` instead of `list` and `Collections.Counter` instead of `collections.Counter`. Also, we use `charAt()` method to get the character at a specific index in a string.</s>
