```
import java.util.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < m ; j ++ ) { if ( i == j ) { ans += m ; } } } System.out.println ( ans ) ; } }

```
