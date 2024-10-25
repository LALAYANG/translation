<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4 8
G*S*****
****G*S*
G*****S*
**G***S*

Expected output:
3


```
n , m = map ( int , input ( ).split ( ) )
c = set ( s.find ( "S" ) - s.find ( "G" ) for s in ( input ( ) for _ in range ( n ) ) )
print ( - 1 if any ( a < 0 for a in c ) else len ( c ) )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int gIndex = s.indexOf('G');
            int sIndex = s.indexOf('S');
            set.add(sIndex - gIndex);
        }
        boolean hasNegative = false;
        for (int a : set) {
            if (a < 0) {
                hasNegative = true;
                break;
            }
        }
        System.out.println(hasNegative ? -1 : set.size());
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the difference between the indices of 'G' and 'S' for each string, and stores the differences in a set. If there is any negative difference, it prints -1, otherwise it prints the size of the set. <｜end▁of▁sentence｜>
