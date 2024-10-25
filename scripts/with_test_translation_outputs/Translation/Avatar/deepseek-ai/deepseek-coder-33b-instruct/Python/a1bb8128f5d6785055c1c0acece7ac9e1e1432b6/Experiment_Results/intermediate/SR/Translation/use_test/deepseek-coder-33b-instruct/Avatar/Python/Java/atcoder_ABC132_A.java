<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
AVVA

Expected output:
Yes


```
S = input ( )
from collections import Counter
c = Counter ( S )
Sa = set ( list ( S ) )
if len ( Sa ) != 2 :
    print ( "No" )
    exit ( )
for i in Sa :
    if c [ i ] != 2 :
        print ( "No" )
        exit ( )
print ( "Yes" )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        Set<Character> Sa = new HashSet<>();
        for (char ch : S.toCharArray()) {
            Sa.add(ch);
        }
        if (Sa.size() != 2) {
            System.out.println("No");
            return;
        }
        for (char ch : Sa) {
            if (c.get(ch) != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```
<|EOT|>
