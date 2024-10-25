<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.put(s.charAt(i), even.getOrDefault(s.charAt(i), 0) + 1);
            } else {
                odd.put(s.charAt(i), odd.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        int countEven0 = even.getOrDefault('0', 0);
        int countOdd1 = odd.getOrDefault('1', 0);
        int countEven1 = even.getOrDefault('1', 0);
        int countOdd0 = odd.getOrDefault('0', 0);
        System.out.println(Math.min(s.length() - (countEven0 + countOdd1), s.length() - (countEven1 + countOdd0)));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, counts the number of '0' and '1' in the even and odd positions of the string, and then calculates the minimum number of changes needed to make the string alternating. <｜end▁of▁sentence｜>
