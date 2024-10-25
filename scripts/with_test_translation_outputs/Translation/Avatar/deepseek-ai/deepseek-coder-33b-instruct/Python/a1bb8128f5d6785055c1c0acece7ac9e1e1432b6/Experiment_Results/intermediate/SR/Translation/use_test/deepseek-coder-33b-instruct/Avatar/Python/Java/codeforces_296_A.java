<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
324 539 83 440 834 640 440 440 440 440

Expected output:
YES


```
n = int ( input ( ) )
m = input ( ).split ( )
possible = True
for i in set ( m ) :
    if m.count ( i ) >= n / 2 + 1 :
        possible = False
        break
print ( 'YES' if possible else 'NO' )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        boolean possible = true;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : m) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
            if (countMap.get(i) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```
<|EOT|>
