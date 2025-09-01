```java
import java.util.* ; import java.io.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int a = 0 ; int b = 0 ; for ( int i = 1 ; i <= n ; i ++ ) { a += i ; } for ( int i = 1 ; i <= m ; i ++ ) { b += i ; } System.out.println ( Math.abs ( a - b ) ) ; } }

```
