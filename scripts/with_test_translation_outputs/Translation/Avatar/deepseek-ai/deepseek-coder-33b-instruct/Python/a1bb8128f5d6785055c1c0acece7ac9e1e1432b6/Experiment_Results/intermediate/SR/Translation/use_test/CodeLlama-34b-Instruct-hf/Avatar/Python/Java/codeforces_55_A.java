<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10

Expected output:
NO

```
n = int ( input ( ) )
while n % 2 == 0 :
    n /= 2
if n == 1 :
    print ( 'YES' )
else :
    print ( 'NO' )


```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Test input:
10

Expected output:
NO</s>
