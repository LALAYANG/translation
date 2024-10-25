<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
..
1
1 2

Expected output:
1


```
soz = input ( )
a = [ 0 ] * ( len ( soz ) + 1 )
for i in range ( 1 , len ( soz ) ) :
    a [ i ] = a [ i - 1 ]
    if soz [ i - 1 ] == soz [ i ] :
        a [ i ] += 1
n = int ( input ( ) )
arr = [ ]
for i in range ( n ) :
    m , l = input ( ).split ( )
    arr.append ( a [ int ( l ) - 1 ] - a [ int ( m ) - 1 ] )
for i in arr :
    print ( i )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] a = new int[soz.length() + 1];
        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i]++;
            }
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String[] ml = scanner.nextLine().split(" ");
            int m = Integer.parseInt(ml[0]);
            int l = Integer.parseInt(ml[1]);
            arr[i] = a[l - 1] - a[m - 1];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
```
<|EOT|>
