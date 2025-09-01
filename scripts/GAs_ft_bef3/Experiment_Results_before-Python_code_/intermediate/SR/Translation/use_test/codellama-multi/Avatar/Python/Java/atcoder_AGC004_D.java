 ```
import java.util.Scanner ; public class codeforces_594_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] != 1 && arr [ i ] != 0 ) { if ( arr [ i ] == arr [ arr [ i ] - 1 ] ) { ans ++ ; } else { if ( arr [ i ] - arr [ arr [ i ] - 1 ] > k ) { ans ++ ; } } } } if ( arr [ 0 ] != 1 ) { ans ++ ; } System.out.println ( ans ) ; } }

```
