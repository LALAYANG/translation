<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the provided Python code:

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

Please note that in Java, you need to import the `java.util.Scanner` class to read input from the user. Also, the `nextInt()` method of the `Scanner` class is used to read an integer from the user. The `next()` method is used to read a string from the user. The `split()` method is used to split a string into an array of substrings based on a specified delimiter. In this case, the delimiter is a space. <｜end▁of▁sentence｜>
