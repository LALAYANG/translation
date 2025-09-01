 ```java
import java.util.Scanner ; public class atcoder_ABC171_B { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int mod = 1000000007 ; int n = stdIn.nextInt ( ) ; int [ ] dp = new int [ n + 2 ] [ 2 ] ; dp [ 0 ] [ 0 ] = 1 ; for ( int i = 0 ; i < n ; i ++ ) { int c = stdIn.nextInt ( ) ; if ( c == 0 ) { dp [ i + 1 ] [ 0 ] += dp [ i ] [ 0 ] ; dp [ i + 1 ] [ 1 ] += dp [ i ] [ 1 ] * 3 ; } else { dp [ i + 1 ] [ 0 ] += dp [ i ] [ 0 ] * 2 ; dp [ i + 1 ] [ 1 ] += dp [ i ] [ 0 ] ; dp [ i + 1 ] [ 1 ] += dp [ i ] [ 1 ] * 3 ; } dp [ i + 1 ] [ 0 ] %= mod ; dp [ i + 1 ] [ 1 ] %= mod ; } System.out.println ( ( dp [ n ] [ 0 ] + dp [ n ] [ 1 ] ) % mod ) ; } }

```
