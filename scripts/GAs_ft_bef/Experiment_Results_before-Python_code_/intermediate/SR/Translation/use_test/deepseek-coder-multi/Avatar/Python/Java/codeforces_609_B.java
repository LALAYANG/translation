```
import java.util.* ; public class codeforces_492_B { public static void main ( String [ ] args ) { Scanner scan = new Scanner ( System.in ) ; int n = scan.nextInt ( ) ; int m = scan.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) arr [ i ] = scan.nextInt ( ) ; HashMap < Integer , Integer > map = new HashMap < > ( ) ; for ( int i = 0 ; i < n ; i ++ ) { if ( ! map.containsKey ( arr [ i ] ) ) map.put ( arr [ i ] , 1 ) ; else { int x = map.get ( arr [ i ] ) ; map.put ( arr [ i ] , x + 1 ) ; } } long res = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( map.get ( arr [ i ] ) > 1 ) { res += n - i - map.get ( arr [ i ] ) ; int x = map.get ( arr [ i ] ) ; map.put ( arr [ i ] , x - 1 ) ; } else res += n - i - 1 ; } System.out.println ( res ) ; } }

```
