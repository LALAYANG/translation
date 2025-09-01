```
import java.util.* ; public class codeforces_231_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int a [ ] = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } Arrays.sort ( a ) ; for ( int i = 1 ; i < n ; i ++ ) { if ( a [ i ] != a [ i - 1 ] && a [ i ] < a [ i - 1 ] * 2 ) { System.out.println ( "YES" ) ; return ; } } System.out.println ( "NO" ) ; } }

```
