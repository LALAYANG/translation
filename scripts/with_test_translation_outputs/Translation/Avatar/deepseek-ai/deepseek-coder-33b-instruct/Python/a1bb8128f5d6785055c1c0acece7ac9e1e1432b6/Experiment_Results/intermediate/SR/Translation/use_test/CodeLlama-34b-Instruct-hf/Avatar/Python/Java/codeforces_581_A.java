<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
34 30

Expected output:
30 2


```
a , b = map ( int , input ( ).split ( ) )
print ( min ( a , b ) , ( max ( a , b ) - min ( a , b ) ) // 2 )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println(min + " " + (max - min) / 2);
    }
}
```

Explanation:

1. We use the `Scanner` class to read the input from the user.
2. We use the `nextInt()` method to read the next integer from the input.
3. We use the `Math.min()` and `Math.max()` methods to find the minimum and maximum of the two input numbers.
4. We use the `/` operator to divide the difference between the maximum and minimum by 2.
5. We use the `System.out.println()` method to print the result to the console.

Sample input and output:

Input:
34 30

Output:
30 2</s>
