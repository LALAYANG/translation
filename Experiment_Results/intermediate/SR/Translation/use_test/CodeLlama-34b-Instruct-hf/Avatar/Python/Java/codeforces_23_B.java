<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
3

Expected output:
1


```
n = int ( input ( ) )
for i in range ( n ) :
    a = int ( input ( ) )
    if a < 2 :
        print ( 0 )
    if a >= 2 :
        print ( a - 2 )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < 2) {
                System.out.println(0);
            } else if (a >= 2) {
                System.out.println(a - 2);
            }
        }
    }
}
```

Note: In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read an integer input from the user. The `println()` method is used to print output to the console.</s>
