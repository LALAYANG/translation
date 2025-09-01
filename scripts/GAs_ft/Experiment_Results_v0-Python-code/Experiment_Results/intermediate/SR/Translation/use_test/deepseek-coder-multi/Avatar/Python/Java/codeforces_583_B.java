```
import java.util.* ; public class codeforces_580_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int ans = 0 ; int cnt = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] <= cnt ) { cnt ++ ; ans ++ ; } } System.out.println ( ans ) ; } }

```
