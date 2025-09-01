 ```java
import java.util.* ; public class atcoder_ABC174_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] [ ] graph = new int [ n + 1 ] [ n + 1 ] ; for ( int i = 0 ; i < m ; i ++ ) { int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; graph [ a ] [ b ] = 1 ; graph [ b ] [ a ] = 1 ; } int ans = 0 ; for ( int i = 1 ; i <= n ; i ++ ) { if ( graph [ i ] [ i ] == 0 ) { int count = 0 ; int sum = 0 ; for ( int j = 1 ; j <= n ; j ++ ) { if ( graph [ i ] [ j ] == 1 ) { count ++ ; sum += graph [ j ] [ i ] ; } } if ( count > 1 && count % 2 == 1 && 2 * count == sum ) { ans ++ ; } } } if ( ( n - ans ) % 2 == 1 ) { ans ++ ; } System.out.println ( ans ) ; } }

```
