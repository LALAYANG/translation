 [INST:perfect]
```
import java.util.Scanner ; public class atcoder_AGC020_B { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int N = stdIn.nextInt ( ) ; int [ ] x = new int [ N ] ; int [ ] y = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { x [ i ] = stdIn.nextInt ( ) ; y [ i ] = stdIn.nextInt ( ) ; } double s = 0 ; for ( int i = 0 ; i < N ; i ++ ) { for ( int j = 0 ; j < N ; j ++ ) { if ( i < j ) { int x1 = x [ i ] ; int x2 = x [ j ] ; int y1 = y [ i ] ; int y2 = y [ j ] ; int dx = x2 - x1 ; int dy = y2 - y1 ; s += Math.sqrt ( dx * dx + dy * dy ) ; } } } s /= N ; System.out.println ( s ) ; } }

```
