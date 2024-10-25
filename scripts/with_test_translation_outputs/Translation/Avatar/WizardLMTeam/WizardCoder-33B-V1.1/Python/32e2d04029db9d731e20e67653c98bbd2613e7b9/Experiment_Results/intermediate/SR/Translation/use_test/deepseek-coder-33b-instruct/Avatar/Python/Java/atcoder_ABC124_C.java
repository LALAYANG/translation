<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                even.put(c, even.getOrDefault(c, 0) + 1);
            } else {
                odd.put(c, odd.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(Math.min(s.length() - (even.getOrDefault('0', 0) + odd.getOrDefault('1', 0)),
                s.length() - (even.getOrDefault('1', 0) + odd.getOrDefault('0', 0))));
    }
}
```
<|EOT|>
