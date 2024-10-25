<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
-10000 1 10000

Expected output:
10001 20000
9999 10001
9999 20000


```
inp = int ( input ( ) )
lista = [ ]
lista = [ int ( x ) for x in input ( ).split ( ) ]
for i in range ( len ( lista ) ) :
    if i == 0 :
        print ( f"{lista[i+1] - lista[i]} {lista[len(lista)-1] - lista[i]}" )
        continue
    elif i == len ( lista ) - 1 :
        print ( f"{lista[len(lista)-1] - lista[len(lista)-2]} {lista[len(lista)-1] - lista[0]}" )
        continue
    elif lista [ i ] - lista [ i - 1 ] > lista [ i + 1 ] - lista [ i ] :
        print ( lista [ i + 1 ] - lista [ i ] , end = " " )
    else :
        print ( lista [ i ] - lista [ i - 1 ] , end = " " )
    if lista [ len ( lista ) - 1 ] - lista [ i ] > lista [ i ] - lista [ 0 ] :
        print ( lista [ len ( lista ) - 1 ] - lista [ i ] )
    else :
        print ( lista [ i ] - lista [ 0 ] )


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

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(arr[i + 1] - arr[i] + " ");
            } else if (i == n - 1) {
                System.out.print(arr[n - 1] - arr[n - 2] + " ");
            } else {
                if (arr[i] - arr[i - 1] > arr[i + 1] - arr[i]) {
                    System.out.print(arr[i + 1] - arr[i] + " ");
                } else {
                    System.out.print(arr[i] - arr[i - 1] + " ");
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[n - 1] - arr[i] > arr[i] - arr[0]) {
                System.out.print(arr[n - 1] - arr[i] + " ");
            } else {
                System.out.print(arr[i] - arr[0] + " ");
            }
        }
    }
}
```
Test Case:

Input:
3
-10000 1 10000

Output:
10001 20000
9999 10001
9999 20000</s>
