<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1
9 8 7 6 5 4 3 2 1 0

Expected output:
10 9 8 7 6 5 4 3 2 1 

```
u = input
n , k = map ( int , u ( ).split ( ) )
M = [ int ( i ) for i in u ( ).split ( ) ]
m = 0
for j in range ( n ) :
    for p in range ( n ) :
        if ( 0 == M [ p ] ) :
            print ( p + 1 , end = ' ' )
            break
    for l in range ( p + 1 - k ) : M [ l ] -= 1
    M [ p ] -= 1


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = sc.nextInt();
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print(p + 1 + " ");
                    break;
                }
            }
            for (int l = p + 1 - k; l < p + 1; l++) {
                M[l] -= 1;
            }
            M[p] -= 1;
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant way to solve the problem. A more efficient solution would be to use a priority queue to keep track of the elements that have not been selected yet, and to use a loop to iterate over the elements in the queue.</s>
