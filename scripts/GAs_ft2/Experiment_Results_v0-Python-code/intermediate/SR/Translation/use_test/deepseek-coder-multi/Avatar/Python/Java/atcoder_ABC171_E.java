```
import java.util.* ; public class codeforces_519_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int xor = 0 ; for ( int i = 0 ; i < n ; i ++ ) { xor ^= arr [ i ] ; } for ( int i = 0 ; i < n ; i ++ ) { System.out.print ( ( xor ^ arr [ i ] ) + " " ) ; } } }

```
