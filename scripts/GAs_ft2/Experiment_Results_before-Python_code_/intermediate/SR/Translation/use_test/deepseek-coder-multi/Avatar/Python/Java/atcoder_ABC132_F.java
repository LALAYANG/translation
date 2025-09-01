```
import java.util.* ; public class codeforces_551_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int mod = 1000000007 ; int [ ] coef = new int [ n + 1 ] ; for ( int i = 1 ; i <= n ; i ++ ) { coef [ i ] = n / i - n / ( i + 1 ) ; } coef [ n ] = 1 ; int [ ] dp = new int [ k + 1 ] ; dp [ 0 ] = 1 ; for ( int i = 1 ; i <= k ; i ++ ) { int tmp = 0 ; for ( int j = n ; j >= 1 ; j -- ) { tmp += dp [ i - 1 ] ; tmp %= mod ; dp [ i ] += coef [ j ] * tmp ; dp [ i ] %= mod ; } } System.out.println ( dp [ k ] ) ; } }

```
