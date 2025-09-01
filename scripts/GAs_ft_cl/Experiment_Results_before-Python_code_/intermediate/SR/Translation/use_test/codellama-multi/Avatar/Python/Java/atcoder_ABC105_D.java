 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int M = sc.nextInt ( ) ; long [ ] A = new long [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextLong ( ) ; } long [ ] cum_remainders = new long [ N + 1 ] ; cum_remainders [ 0 ] = 0 ; for ( int i = 0 ; i < N ; i ++ ) { cum_remainders [ i + 1 ] = ( cum_remainders [ i ] + A [ i ] ) % M ; } long [ ] remainder_counts = new long [ M ] ; for ( int i = 0 ; i < N + 1 ; i ++ ) { remainder_counts [ cum_remainders [ i ] ] ++ ; } long combinations = 0 ; for ( int i = 0 ; i < M ; i ++ ) { combinations += remainder_counts [ i ] * ( remainder_counts [ i ] - 1 ) / 2 ; } System.out.println ( combinations ) ; } }

```
