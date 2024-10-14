<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
6418.000 157.986

Expected output:
0.014


```
n = int ( input ( ) )
arr = list ( map ( float , input ( ).split ( ) ) )
arr = sorted ( [ x - int ( x ) for x in arr if x - int ( x ) != 0 ] )
o = 2 * n - len ( arr )
arr_sum = sum ( arr )
res = int ( 2e9 )
for i in range ( n + 1 ) :
    if i + o >= n :
        res = min ( res , abs ( i - arr_sum ) )
print ( "%.3f" % res )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        int o = 2 * n - arr.length;
        double arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        double res = 2e9;
        for (int i = 0; i < n + 1; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f", res);
    }
}
```
Note: The `2e9` in the Java code is equivalent to `2 * 10^9` in the Python code, which is a notation for 2 followed by 9 zeros.</s>
