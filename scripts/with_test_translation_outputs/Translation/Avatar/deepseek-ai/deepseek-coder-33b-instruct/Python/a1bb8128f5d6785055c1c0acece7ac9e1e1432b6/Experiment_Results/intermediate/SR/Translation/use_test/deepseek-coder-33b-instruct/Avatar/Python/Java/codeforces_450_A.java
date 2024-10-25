<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Expected output:
46


```
n , m = map ( int , input ( ).split ( ) )
l = list ( map ( int , input ( ).split ( ) ) )
l2 = [ ]
for i in l :
    if i % m == 0 :
        l2.append ( i // m )
    else :
        l2.append ( i // m + 1 )
mx = max ( l2 )
for i in range ( n ) :
    if l2 [ i ] == mx :
        ind = i
print ( ind + 1 )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int[] l2 = new int[n];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
            if (l2[i] > max) {
                max = l2[i];
                index = i;
            }
        }
        System.out.println(index + 1);
    }
}
```
<|EOT|>
