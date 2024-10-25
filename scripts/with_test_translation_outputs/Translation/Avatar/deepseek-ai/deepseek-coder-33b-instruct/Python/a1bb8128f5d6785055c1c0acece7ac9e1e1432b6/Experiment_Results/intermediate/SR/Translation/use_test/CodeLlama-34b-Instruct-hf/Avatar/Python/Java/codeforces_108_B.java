<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
8
421 250 398 257 512 329 25 972

Expected output:
YES


```
def s ( ) :
    input ( )
    a = list ( map ( int , input ( ).split ( ) ) )
    a.sort ( )
    for i in range ( 1 , len ( a ) ) :
        if a [ i ] != a [ i - 1 ] and a [ i ] < a [ i - 1 ] * 2 :
            return 'YES'
    return 'NO'
print ( s ( ) )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
```
Note: The above code uses the `Arrays.sort()` method to sort the input array. If you want to implement the sorting algorithm yourself, you can use the bubble sort or any other sorting algorithm of your choice.</s>
