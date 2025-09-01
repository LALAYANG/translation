```
import java.util.* ; public class codeforces_569_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int ans = Math.abs ( arr [ 0 ] ) ; for ( int i = 1 ; i < n ; i ++ ) { ans += Math.abs ( arr [ i ] - arr [ i - 1 ] ) ; } System.out.println ( ans ) ; } }

```
