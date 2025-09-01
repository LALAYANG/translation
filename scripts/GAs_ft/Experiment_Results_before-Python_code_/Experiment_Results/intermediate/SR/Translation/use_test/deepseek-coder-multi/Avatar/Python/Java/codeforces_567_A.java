```
import java.util.* ; public class codeforces_569_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < n ; i ++ ) { int a = arr [ i ] ; int b = arr [ i ] ; if ( i == 0 ) { a = arr [ i + 1 ] - arr [ i ] ; b = arr [ n - 1 ] - arr [ i ] ; } else if ( i == n - 1 ) { a = arr [ i ] - arr [ i - 1 ] ; b = arr [ i ] - arr [ 0 ] ; } else { a = Math.min ( arr [ i ] - arr [ i - 1 ] , arr [ i + 1 ] - arr [ i ] ) ; b = Math.max ( arr [ i ] - arr [ 0 ] , arr [ n - 1 ] - arr [ i ] ) ; } System.out.println ( a + " " + b ) ; } }

```
