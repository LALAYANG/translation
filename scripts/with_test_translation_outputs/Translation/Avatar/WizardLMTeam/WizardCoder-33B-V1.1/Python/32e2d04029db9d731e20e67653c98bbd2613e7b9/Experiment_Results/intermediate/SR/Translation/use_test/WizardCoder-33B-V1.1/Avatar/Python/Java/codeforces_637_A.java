<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
15
100 200 300 500 300 400 600 300 100 200 400 300 600 200 100

Expected output:
300


```
import sys
input = sys.stdin.readline
from collections import Counter
n = int ( input ( ) )
s = input ( ) [ : - 1 ].split ( )
w = Counter ( s )
s = s [ : : - 1 ]
c , a = - 1 , 0
for i in w :
    if w [ i ] == max ( w.values ( ) ) :
        if s.index ( i ) > c :
            a = i
            c = s.index ( i )
print ( a )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String num : s) {
            w.put(num, w.getOrDefault(num, 0) + 1);
        }
        int maxCount = Collections.max(w.values());
        int index = -1;
        String answer = "";
        for (int i = 0; i < s.length; i++) {
            if (w.get(s[i]) == maxCount && i > index) {
                answer = s[i];
                index = i;
            }
        }
        System.out.println(answer);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, counts the frequency of each number, and then finds the number that appears the most and has the smallest index. <｜end▁of▁sentence｜>
