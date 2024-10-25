<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
1 16 2 15
3 14 4 13
5 12 6 11
7 10 8 9


```
n = int ( input ( ) )
i , j = 1 , n * n
while i < j :
    print ( i , j )
    i += 1
    j -= 1


```
[/INST]
```java
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, j = n * n;
        while (i < j) {
            System.out.print(i + " ");
            i++;
            System.out.print(j + " ");
            j--;
        }
    }
}
```

Note: The above code uses the `Scanner` class to read input from the user. If you want to hardcode the input, you can replace the `sc.nextInt()` line with `int n = 4;` (or any other value you want to use as input).</s>
