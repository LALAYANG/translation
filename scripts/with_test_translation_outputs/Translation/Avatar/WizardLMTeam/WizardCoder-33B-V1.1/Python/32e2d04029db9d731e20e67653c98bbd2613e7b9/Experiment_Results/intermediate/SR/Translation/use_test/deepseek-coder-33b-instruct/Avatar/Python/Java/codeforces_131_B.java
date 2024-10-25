<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
            } else {
                if (map.containsKey(-key)) {
                    count += entry.getValue() * map.get(-key);
                }
            }
        }
        System.out.println(count / 2);
    }
}
```
<|EOT|>
