<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 4
-3 7 8 2
-12 1 10 2
-2 8 9 3

Expected output:
2


```
import math
n , d = map ( int , input ( ).split ( ) )
points = [ list ( map ( int , input ( ).split ( ) ) ) for _ in range ( n ) ]
def dist ( x , y ) :
    tmp = 0.0
    for i in range ( d ) :
        tmp += ( x [ i ] - y [ i ] ) ** 2
    return math.sqrt ( tmp )
count = 0
for i , elm in enumerate ( points ) :
    for j in range ( i + 1 , n ) :
        if dist ( elm , points [ j ] ).is_integer ( ) :
            count += 1
print ( count )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = 0.0;
                for (int k = 0; k < d; k++) {
                    distance += Math.pow(points[i][k] - points[j][k], 2);
                }
                distance = Math.sqrt(distance);
                if (distance % 1 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
```
Note: In Java, we use the `Math.pow()` method to calculate the power of a number, and the `Math.sqrt()` method to calculate the square root of a number. We also use the `%` operator to check if a number is an integer.</s>
