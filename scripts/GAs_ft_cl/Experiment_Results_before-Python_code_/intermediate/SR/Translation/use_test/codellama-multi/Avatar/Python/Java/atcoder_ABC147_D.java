 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; long [ ] A = new long [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextLong ( ) ; } long ans = 0 ; for ( int b = 0 ; b < 60 ; b ++ ) { int bs = 0 ; for ( int i = 0 ; i < N ; i ++ ) { if ( ( A [ i ] >> b ) % 2 == 1 ) { bs ++ ; } } ans = ( ans + bs * ( N - bs ) * ( 1L << b ) ) % 1000000007 ; } System.out.println ( ans ) ; } }

```
