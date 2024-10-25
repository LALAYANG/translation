<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
10 -10

Expected output:
1


```
import sys
input = sys.stdin.readline
from collections import Counter
n = int ( input ( ) )
w = Counter ( map ( int , input ( ).split ( ) ) )
c = 0
for i in w :
    if i == 0 :
        c += w [ i ] * ( w [ i ] - 1 )
    else :
        if - i in w :
            c += w [ i ] * w [ - i ]
print ( c // 2 )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            if (key == 0) {
                count += entry.getValue() * (entry.getValue() - 1);
            } else if (map.containsKey(-key)) {
                count += entry.getValue() * map.get(-key);
            }
        }
        System.out.println(count / 2);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the standard input, then reads `n` more integers into a `HashMap`. It then iterates over the entries in the `HashMap`, and for each entry, if the key is 0, it adds the square of the value to `count`. If the key is not 0 and its negation is in the `HashMap`, it multiplies the value of the entry by the value of the entry for its negation and adds the result to `count`. Finally, it prints `count` divided by 2. <｜end▁of▁sentence｜>
