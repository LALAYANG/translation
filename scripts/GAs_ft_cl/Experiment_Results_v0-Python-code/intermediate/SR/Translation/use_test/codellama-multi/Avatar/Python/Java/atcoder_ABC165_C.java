 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int M = sc.nextInt ( ) ; int Q = sc.nextInt ( ) ; int [ ] a = new int [ Q ] ; int [ ] b = new int [ Q ] ; int [ ] c = new int [ Q ] ; int [ ] d = new int [ Q ] ; for ( int i = 0 ; i < Q ; i ++ ) { a [ i ] = sc.nextInt ( ) ; b [ i ] = sc.nextInt ( ) ; c [ i ] = sc.nextInt ( ) ; d [ i ] = sc.nextInt ( ) ; } long ans = 0 ; for ( int i = 0 ; i < Q ; i ++ ) { if ( a [ i ] == 1 ) { if ( b [ i ] == 1 ) { if ( c [ i ] == 1 ) { ans += d [ i ] ; } } } } System.out.println ( ans ) ; } }

```
