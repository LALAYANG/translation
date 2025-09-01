```
import java.util.* ; public class atcoder_ABC121_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } Arrays.sort ( A ) ; int ans = 0 ; for ( int i = N - 1 ; i >= 0 ; i -= 2 ) { ans += A [ i ] ; } System.out.println ( ans ) ; } }

```
