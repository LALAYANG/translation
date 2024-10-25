<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soz = sc.nextLine();
        int[] a = new int[soz.length() + 1];
        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i]++;
            }
        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String[] ml = sc.nextLine().split(" ");
            int m = Integer.parseInt(ml[0]);
            int l = Integer.parseInt(ml[1]);
            arr[i] = a[l - 1] - a[m - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
```
Note: In Java, we use `Scanner` to read input from the user, and `System.out.println()` to print output to the console. The `split()` method is used to split a string into an array of substrings based on a delimiter. The `Integer.parseInt()` method is used to convert a string to an integer.</s>
