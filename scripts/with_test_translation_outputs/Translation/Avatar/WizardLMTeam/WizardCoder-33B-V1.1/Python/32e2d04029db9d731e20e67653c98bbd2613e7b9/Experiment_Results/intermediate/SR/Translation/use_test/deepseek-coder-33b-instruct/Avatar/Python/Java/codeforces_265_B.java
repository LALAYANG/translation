<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int ans = n - 1;
        int last = 0;
        for (int i : l) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
    }
}
```
<|EOT|>
