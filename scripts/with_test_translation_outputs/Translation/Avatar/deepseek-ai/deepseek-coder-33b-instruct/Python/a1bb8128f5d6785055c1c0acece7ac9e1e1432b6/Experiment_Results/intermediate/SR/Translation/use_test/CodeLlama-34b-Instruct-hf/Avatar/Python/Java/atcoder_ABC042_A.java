<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
7 5 5

Expected output:
YES


```
ABC = tuple ( map ( int , input ( ).split ( ) ) )
if ABC.count ( 5 ) == 2 :
    print ( 'YES' if sum ( ABC ) == 17 else 'NO' )
else :
    print ( 'NO' )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 5 && b == 5 && c == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. We also use the `System.out.println()` method to print output to the console.</s>
