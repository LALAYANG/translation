 ```java
import java.util.Scanner ; public class codeforces_414_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) * n + i ; } Arrays.sort ( arr ) ; int cnt = 0 ; for ( int i = 0 ; i < n ; i ++ ) { int d = arr [ i ] % n % 2 ; if ( d % 2 != i % 2 ) { cnt ++ ; } } System.out.println ( cnt / 2 ) ; } }

```
