 [INST:java]
import java.util.Scanner ; public class atcoder_ABC175_A { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int N = stdIn.nextInt ( ) ; int D = stdIn.nextInt ( ) ; int X = stdIn.nextInt ( ) ; double ans = 0 ; for ( int i = 0 ; i < N ; i ++ ) { ans += D + ( N - 0.5 ) * X ; D += D / N + 5 * X / ( 2 * N ) ; X += 2 * X / N ; } System.out.println ( ans ) ; } }

```
