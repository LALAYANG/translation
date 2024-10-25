<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        HashMap<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        HashSet<Character> Sa = new HashSet<>();
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

This Java code does the same thing as the Python code. It reads a string from the user, counts the occurrences of each character in the string, and checks if there are exactly two unique characters in the string, each occurring twice. If these conditions are met, it prints "Yes", otherwise it prints "No". <｜end▁of▁sentence｜>
