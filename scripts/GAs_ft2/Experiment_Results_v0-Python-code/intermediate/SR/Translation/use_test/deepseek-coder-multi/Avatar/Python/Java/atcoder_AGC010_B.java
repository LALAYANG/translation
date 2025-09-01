```
import java.util.* ; public class codeforces_552_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int sum = 0 ; for ( int i = 0 ; i < n ; i ++ ) { sum += a [ i ] ; } if ( sum % n != 0 ) { System.out.println ( "NO" ) ; return ; } int k = sum / n ; a = Arrays.copyOf ( a , n + 1 ) ; a [ n ] = a [ 0 ] ; boolean ok = true ; for ( int i = 0 ; i < n ; i ++ ) { if ( ( k - a [ i ] + a [ i + 1 ] ) % n != 0 ) { ok = false ; break ; } } if ( ok ) { System.out.println ( "YES" ) ; } else { System.out.println ( "NO" ) ; } } }

```
