 [INST:java]
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] == 1 ) { continue ; } int cnt = 0 ; for ( int j = 0 ; j < n ; j ++ ) { if ( a [ j ] == a [ i ] ) { cnt ++ ; } } if ( cnt == k ) { ans ++ ; } } } System.out.println ( ans ) ; } }

```
