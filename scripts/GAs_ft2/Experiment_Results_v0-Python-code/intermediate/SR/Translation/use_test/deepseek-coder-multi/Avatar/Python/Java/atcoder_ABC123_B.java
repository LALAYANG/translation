```
import java.util.* ; import java.io.* ; public class codeforces_262_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } Arrays.sort ( a ) ; int ans = 0 ; for ( int i = 1 ; i < n ; i ++ ) { ans += a [ i ] ; } ans += a [ 0 ] ; System.out.println ( ans ) ; } }

```
