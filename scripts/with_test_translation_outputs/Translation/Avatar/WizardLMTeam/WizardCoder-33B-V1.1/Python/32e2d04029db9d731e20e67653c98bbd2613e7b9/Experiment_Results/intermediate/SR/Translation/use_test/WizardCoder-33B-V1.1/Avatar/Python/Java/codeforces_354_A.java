<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 100 1 1 10000
1 2 3 4 5

Expected output:
312


```
n , L , R , QL , QR = map ( int , input ( ).split ( ) )
W = list ( map ( int , input ( ).split ( ) ) )
sum_el = [ 0 ]
for i in range ( 1 , n + 1 ) :
    sum_el.append ( W [ i - 1 ] + sum_el [ i - 1 ] )
answer = QR * ( n - 1 ) + sum_el [ n ] * R
for i in range ( 1 , n + 1 ) :
    energy = L * sum_el [ i ] + R * ( sum_el [ n ] - sum_el [ i ] )
    if i > ( n - i ) :
        energy = energy + ( i - ( n - i ) - 1 ) * QL
    elif ( n - i ) > i :
        energy = energy + ( ( n - i ) - i - 1 ) * QR
    if energy < answer :
        answer = energy
print ( answer )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int QL = scanner.nextInt();
        int QR = scanner.nextInt();
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = scanner.nextInt();
        }
        long[] sum_el = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            sum_el[i] = W[i - 1] + sum_el[i - 1];
        }
        long answer = QR * (n - 1) + sum_el[n] * R;
        for (int i = 1; i <= n; i++) {
            long energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
            if (i > (n - i)) {
                energy = energy + (i - (n - i) - 1) * QL;
            } else if ((n - i) > i) {
                energy = energy + ((n - i) - i - 1) * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
        }
        System.out.println(answer);
    }
}
``` <｜end▁of▁sentence｜>
