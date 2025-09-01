```
import java.util.* ; public class atcoder_ABC121_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } Arrays.sort ( a ) ; long ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = i + 1 ; j < n ; j ++ ) { int x = a [ i ] + a [ j ] ; int y = a [ j ] - a [ i ] ; int idx = Arrays.binarySearch ( a , x ) ; if ( idx < 0 ) { continue ; } int idx2 = Arrays.binarySearch ( a , y ) ; if ( idx2 < 0 ) { continue ; } ans += ( long ) ( idx - idx2 - 1 ) ; } } System.out.println ( ans ) ; } }

```
