```java
import java.util.* ; import java.io.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int a = 0 ; int b = 0 ; for ( int i = 0 ; i < m ; i ++ ) { a += sc.nextInt ( ) ; b += sc.nextInt ( ) ; } System.out.println ( ( a - b ) % 2 == 0 && Math.abs ( a - b ) <= n ? "YES" : "NO" ) ; } }

```
