 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; long [ ] a = new long [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextLong ( ) ; } long ans = 0 ; for ( int i = 0 ; i < 60 ; i ++ ) { long cnt = 0 ; for ( int j = 0 ; j < n ; j ++ ) { if ( ( a [ j ] >> i & 1 ) == 1 ) { cnt ++ ; } } ans = ( ans + cnt * ( n - cnt ) * ( 1 << i ) ) % 1000000007 ; } System.out.println ( ans ) ; } }

```
