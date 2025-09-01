```
import java.util.* ; public class codeforces_272_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } HashMap < Integer , Integer > map = new HashMap < > ( ) ; for ( int i = 0 ; i < n ; i ++ ) { if ( map.containsKey ( arr [ i ] ) ) { map.put ( arr [ i ] , map.get ( arr [ i ] ) + 1 ) ; } else { map.put ( arr [ i ] , 1 ) ; } } long res = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( map.get ( arr [ i ] ) > 1 ) { res += n - i - map.get ( arr [ i ] ) ; map.put ( arr [ i ] , map.get ( arr [ i ] ) - 1 ) ; } else { res += n - i - 1 ; } } System.out.println ( res ) ; } }

```
