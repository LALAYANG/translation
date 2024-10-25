<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }
        ArrayList<Float> arrList = new ArrayList<>();
        for (float x : arr) {
            if (x - (int) x != 0) {
                arrList.add(x - (int) x);
            }
        }
        Collections.sort(arrList);
        int o = 2 * n - arrList.size();
        float arrSum = 0;
        for (float x : arrList) {
            arrSum += x;
        }
        float res = Float.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f", res);
    }
}
```
<|EOT|>
