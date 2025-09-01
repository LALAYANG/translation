 [INST:java]
import java.util.Scanner ; public class atcoder_ABC175_A { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int n = stdIn.nextInt ( ) ; int d = stdIn.nextInt ( ) ; int x = stdIn.nextInt ( ) ; double ret = 0 ; for ( int i = 0 ; i < n ; i ++ ) { ret += d + ( n - 0.5 ) * x ; d = d + d / n + 5 * x / ( 2 * n ) ; x += 2 * x / n ; n -- ; } System.out.println ( ret ) ; } }

```
