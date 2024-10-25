<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 2 2 8
4 6
1 5
3 8

Expected output:
19
17
15
14
13
12
10
8


```
x , y , z , k = [ int ( _ ) for _ in input ( ).split ( ) ]
a = [ int ( _ ) for _ in input ( ).split ( ) ]
b = [ int ( _ ) for _ in input ( ).split ( ) ]
c = [ int ( _ ) for _ in input ( ).split ( ) ]
ab = [ ]
for i in range ( x ) :
    for j in range ( y ) :
        ab.append ( a [ i ] + b [ j ] )
ab.sort ( reverse = True )
abc = [ ]
for i in range ( min ( k , x * y ) ) :
    for j in range ( z ) :
        abc.append ( ab [ i ] + c [ j ] )
abc.sort ( reverse = True )
for i in range ( k ) :
    print ( abc [ i ] )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[x];
        int[] b = new int[y];
        int[] c = new int[z];

        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < z; i++) {
            c[i] = sc.nextInt();
        }

        int[] ab = new int[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }

        int[] abc = new int[min(k, x * y) * z];
        for (int i = 0; i < min(k, x * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[i * z + j] = ab[i] + c[j];
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `min` method to find the minimum of two integers. The `main` method is the entry point of the program, and it contains the logic to read the input, calculate the output, and print it to the console.</s>
