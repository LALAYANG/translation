<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
6 5 6 7

Expected output:
2 3


```
n = int ( input ( ) )
l = list ( map ( int , input ( ).split ( ) ) )
high = 1
tower = n
maximum = 1
l.sort ( )
for i in range ( 1 , n ) :
    if l [ i ] == l [ i - 1 ] :
        tower -= 1
        high += 1
    else :
        if high > maximum :
            maximum = high
        high = 1
if high > maximum :
    maximum = high
print ( maximum , tower )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int high = 1;
        int tower = n;
        int maximum = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}
```
<|EOT|>
