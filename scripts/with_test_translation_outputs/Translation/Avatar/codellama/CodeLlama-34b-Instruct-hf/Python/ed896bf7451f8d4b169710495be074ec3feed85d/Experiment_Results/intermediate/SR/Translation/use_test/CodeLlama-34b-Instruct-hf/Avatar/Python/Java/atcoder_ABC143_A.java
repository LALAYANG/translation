<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
79 6

Expected output:
67


```
A , B = map ( int , input ( ).split ( ) )
ans = A - 2 * B
if ans < 0 :
    ans = 0
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}
```

Test input:
79 6

Expected output:
67

Actual output:
67</s>
