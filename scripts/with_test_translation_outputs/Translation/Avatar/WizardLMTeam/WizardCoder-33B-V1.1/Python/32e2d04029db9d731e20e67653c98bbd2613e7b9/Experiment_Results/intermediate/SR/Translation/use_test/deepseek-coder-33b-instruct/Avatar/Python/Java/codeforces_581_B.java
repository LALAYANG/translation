<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
55 50 51 53 53 52 50 54 54 53

Expected output:
0 5 4 2 2 3 5 1 0 0 

```
n = int ( input ( ) )
arr = list ( map ( int , input ( ).strip ( ).split ( ) ) ) [ : n ]
ans = [ 0 ] * n
mx = arr [ - 1 ]
for i in range ( n - 2 , - 1 , - 1 ) :
    ans [ i ] = max ( 0 , mx - arr [ i ] + 1 )
    if arr [ i ] > mx :
        mx = arr [ i ]
print ( * ans )


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
        int[] ans = new int[n];
        int mx = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(0, mx - arr[i] + 1);
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```
<|EOT|>
