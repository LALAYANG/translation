<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
        for (String i : s) {
            w.put(i, w.getOrDefault(i, 0) + 1);
        }
        int maxCount = Collections.max(w.values());
        int maxIndex = -1;
        String maxValue = "";
        for (int i = s.length - 1; i >= 0; i--) {
            if (w.get(s[i]) == maxCount && i > maxIndex) {
                maxIndex = i;
                maxValue = s[i];
            }
        }
        System.out.println(maxValue);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, counts the occurrences of each number, and then finds the maximum occurring number that appears last in the list.
<|EOT|>
