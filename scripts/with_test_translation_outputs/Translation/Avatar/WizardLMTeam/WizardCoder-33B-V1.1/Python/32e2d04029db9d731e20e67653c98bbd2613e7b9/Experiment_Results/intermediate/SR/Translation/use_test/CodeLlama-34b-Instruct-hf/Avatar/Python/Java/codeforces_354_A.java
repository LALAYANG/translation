<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int QR = sc.nextInt();
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
        }

        int sumEL = 0;
        for (int i = 1; i <= n; i++) {
            sumEL += W[i - 1];
        }

        int answer = QR * (n - 1) + sumEL * R;

        for (int i = 1; i <= n; i++) {
            int energy = L * sumEL + R * (sumEL - sumEL);
            if (i > (n - i)) {
                energy += (i - (n - i) - 1) * QL;
            } else if ((n - i) > i) {
                energy += ((n - i) - i - 1) * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
        }

        System.out.println(answer);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution, and there may be better ways to solve the problem.</s>
