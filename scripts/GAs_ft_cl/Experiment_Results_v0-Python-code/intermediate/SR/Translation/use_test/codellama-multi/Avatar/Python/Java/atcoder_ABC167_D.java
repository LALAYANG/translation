 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; a [ 0 ] = - 1 ; for ( int i = 1 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int [ ] dp = new int [ n + 1 ] ; dp [ 0 ] = 0 ; for ( int i = 1 ; i <= n ; i ++ ) { dp [ i ] = dp [ i - 1 ] + 1 ; if ( a [ i - 1 ] != a [ i ] ) { dp [ i ] = Math.min ( dp [ i ] , dp [ i - 1 ] ) ; } } int ans = 0 ; for ( int i = 0 ; i <= n ; i ++ ) { if ( dp [ i ] <= k ) { ans ++ ; } } System.out.println ( ans ) ; } }

```
