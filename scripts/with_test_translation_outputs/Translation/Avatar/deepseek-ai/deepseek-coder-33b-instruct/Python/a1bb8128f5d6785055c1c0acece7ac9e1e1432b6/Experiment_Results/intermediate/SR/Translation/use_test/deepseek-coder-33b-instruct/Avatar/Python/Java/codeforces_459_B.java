<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
5 5 5 5 5

Expected output:
0 10

```
n = int ( input ( ) )
l1 = list ( map ( int , input ( ).split ( ) ) )
l1.sort ( )
a = l1 [ - 1 ]
b = l1 [ 0 ]
if a == b :
    print ( a - b , ( n ) * ( n - 1 ) // 2 )
else :
    ac = l1.count ( a )
    bc = l1.count ( b )
    print ( a - b , ac * bc )


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
        int a = arr[n - 1];
        int b = arr[0];
        if (a == b) {
            System.out.println((a - b) + " " + (n * (n - 1) / 2));
        } else {
            int ac = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == a) {
                    ac++;
                } else if (arr[i] == b) {
                    bc++;
                }
            }
            System.out.println((a - b) + " " + (ac * bc));
        }
    }
}
```
<|EOT|>
