<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
55 50 51 53 53 52 50 54 54 53

Expected output:
0 5 4 2 2 3 5 1 0 0 

```
n = int ( input ( ) )
arr = list ( map ( int , input ( ).strip ( ).split ( ) ) ) [ : n ]
ans = [ 0 ] * n
mx = arr [ - 1 ]
for i in range ( n - 2 , - 1 , - 1 ) :
    ans [ i ] = max ( 0 , mx - arr [ i ] + 1 )
    if arr [ i ] > mx :
        mx = arr [ i ]
print ( * ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int mx = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(0, mx - arr[i] + 1);
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

Note: The above code uses the `Math.max` method to find the maximum of two integers. If you are using an older version of Java that does not have this method, you can use the `Math.max` method from the `java.lang.Math` class.</s>
