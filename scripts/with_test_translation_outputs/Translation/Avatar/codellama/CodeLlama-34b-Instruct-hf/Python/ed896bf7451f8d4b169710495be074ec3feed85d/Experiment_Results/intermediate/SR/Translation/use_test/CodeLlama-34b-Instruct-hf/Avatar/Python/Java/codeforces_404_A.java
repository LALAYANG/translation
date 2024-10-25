<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
xax
axa
xaa

Expected output:
NO


```
n = int ( input ( ) )
s = [ ]
for i in range ( n ) :
    k = input ( )
    s.append ( k )
flag = 0
d1 = [ ]
d2 = [ ]
rem = set ( )
for i in range ( n ) :
    for j in range ( n ) :
        if ( i == j ) :
            d1.append ( s [ i ] [ j ] )
        if ( i == n - j - 1 ) :
            d2.append ( s [ i ] [ j ] )
        if ( i != j and i != n - j - 1 ) :
            rem.add ( s [ i ] [ j ] )
if ( len ( rem ) != 1 ) :
    print ( 'NO' )
elif ( d1 != d2 ) :
    print ( 'NO' )
elif ( len ( set ( d1 ) ) != 1 ) :
    print ( 'NO' )
elif ( set ( d1 ) == rem ) :
    print ( 'NO' )
else :
    print ( 'YES' )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] s = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = sc.next();
            }
        }

        boolean flag = true;
        String[] d1 = new String[n];
        String[] d2 = new String[n];
        Set<String> rem = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1[i] = s[i][j];
                } else if (i == n - j - 1) {
                    d2[i] = s[i][j];
                } else {
                    rem.add(s[i][j]);
                }
            }
        }

        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!Arrays.equals(d1, d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(Arrays.asList(d1)).size() != 1) {
            System.out.println("NO");
        } else if (rem.containsAll(Arrays.asList(d1))) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
```
Note: The above code uses the `java.util.Scanner` class to read input from the user, and the `java.util.Set` and `java.util.HashSet` classes to store and manipulate the set of unique elements in the matrix. The `java.util.Arrays` class is used to convert the arrays to lists and to compare the arrays.</s>
