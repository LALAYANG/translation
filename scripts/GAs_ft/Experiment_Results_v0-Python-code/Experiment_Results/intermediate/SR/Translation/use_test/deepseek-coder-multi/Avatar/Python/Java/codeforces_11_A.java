```
import java.util.* ; public class codeforces_266_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int count = 0 ; for ( int i = 0 ; i < n - 1 ; i ++ ) { if ( arr [ i ] > arr [ i + 1 ] ) { int diff = arr [ i ] - arr [ i + 1 ] ; int add = ( diff / d ) ; if ( diff % d != 0 ) { add ++ ; } count += add ; arr [ i + 1 ] += add * d ; } } System.out.println ( count ) ; } }

```
