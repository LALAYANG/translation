<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
34 621

Expected output:
NO


```
n , k = map ( int , input ( ).split ( ) )
x = 0
if k <= max ( n ** 2 // 2 , n ** 2 - ( n ** 2 // 2 ) ) :
    print ( 'YES' )
    for i in range ( n ) :
        for j in range ( n ) :
            if i % 2 == j % 2 and x < k :
                print ( 'L' , end = '' )
                x += 1
            else : print ( 'S' , end = '' )
        print ( )
else : print ( 'NO' )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = 0;

        if (k <= Math.max(n * n / 2, n * n - (n * n / 2))) {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == j % 2 && x < k) {
                        System.out.print("L");
                        x++;
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: In Java, the `Math.max()` method is used to find the maximum of two numbers, instead of the `max()` function used in Python.</s>
