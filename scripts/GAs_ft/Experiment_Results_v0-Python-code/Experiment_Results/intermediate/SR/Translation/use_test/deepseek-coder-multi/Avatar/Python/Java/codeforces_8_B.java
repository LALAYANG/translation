```
import java.util.Scanner ; public class codeforces_262_A { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int n = in.nextInt ( ) ; int k = in.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = in.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] >= a [ k - 1 ] && a [ i ] > 0 ) { ans ++ ; } } System.out.println ( ans ) ; } }

```
