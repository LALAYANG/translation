 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] a = new int [ n + 1 ] ; int [ ] b = new int [ m ] ; for ( int i = 0 ; i < m ; i ++ ) { b [ i ] = sc.nextInt ( ) ; } for ( int i = 1 ; i <= n ; i ++ ) { a [ i ] = 0 ; } for ( int i = 0 ; i < m ; i ++ ) { a [ b [ i ] ] ++ ; } int ans = 0 ; for ( int i = 1 ; i <= n ; i ++ ) { if ( a [ i ] == 0 ) { ans ++ ; } } System.out.println ( ans ) ; } }

```
