 ```java
import java.util.Scanner ; public class atcoder_ABC119_B { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int n = stdIn.nextInt ( ) ; int k = stdIn.nextInt ( ) ; int l = stdIn.nextInt ( ) ; int r = stdIn.nextInt ( ) ; int sa = stdIn.nextInt ( ) ; int sk = stdIn.nextInt ( ) ; int [ ] ans = new int [ n ] ; for ( int i = 0 ; i < k ; i ++ ) { ans [ i ] = sk / n ; if ( k - i > 0 ) { ans [ i ] ++ ; } } for ( int i = k ; i < n ; i ++ ) { ans [ i ] = sa / n ; if ( n - i > k ) { ans [ i ] ++ ; } } for ( int i = 0 ; i < n ; i ++ ) { System.out.print ( ans [ i ] + " " ) ; } } }

```
