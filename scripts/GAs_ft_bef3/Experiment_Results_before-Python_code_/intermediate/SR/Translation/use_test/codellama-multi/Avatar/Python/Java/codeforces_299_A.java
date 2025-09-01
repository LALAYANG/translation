 [java]
import java.util.Scanner ; public class atcoder_ABC154_A { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int num = scanner.nextInt ( ) ; int [ ] arr = new int [ num ] ; for ( int i = 0 ; i < num ; i ++ ) { arr [ i ] = scanner.nextInt ( ) ; } int min = Integer.MAX_VALUE ; for ( int i = 0 ; i < num ; i ++ ) { if ( arr [ i ] < min ) { min = arr [ i ] ; } } if ( min == arr [ 0 ] ) { System.out.println ( 0 ) ; } else { System.out.println ( 1 ) ; } } }

```
