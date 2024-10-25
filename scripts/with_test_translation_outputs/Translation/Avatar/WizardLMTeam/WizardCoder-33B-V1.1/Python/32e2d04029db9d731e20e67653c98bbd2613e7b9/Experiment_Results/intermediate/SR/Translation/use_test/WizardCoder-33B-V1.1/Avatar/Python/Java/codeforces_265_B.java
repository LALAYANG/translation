<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
2
1
2
1
1

Expected output:
14


```
n = int ( input ( ) )
l = [ ]
for i in range ( n ) :
    l.append ( int ( input ( ) ) )
ans = n - 1
last = 0
for i in l :
    ans += abs ( last - i ) + 1
    last = i
print ( ans )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = n - 1;
        int last = 0;
        for (int i : arr) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the standard input, then reads `n` more integers into an array. It then calculates a result `ans` by iterating over the array, adding the absolute difference between the current number and the last number plus one to `ans`, and updating the last number to the current number. Finally, it prints the result `ans`. <｜end▁of▁sentence｜>
