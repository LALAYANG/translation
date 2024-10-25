<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        List<Character> d1 = new ArrayList<>();
        List<Character> d2 = new ArrayList<>();
        Set<Character> rem = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1.add(s[i].charAt(j));
                }
                if (i == n - j - 1) {
                    d2.add(s[i].charAt(j));
                }
                if (i != j && i != n - j - 1) {
                    rem.add(s[i].charAt(j));
                }
            }
        }
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).size() != 1) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).equals(rem)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
```
<|EOT|>
