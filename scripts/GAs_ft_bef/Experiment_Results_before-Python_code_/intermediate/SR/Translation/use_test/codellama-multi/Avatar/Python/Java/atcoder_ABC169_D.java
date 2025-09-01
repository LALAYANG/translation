 ```java
import java.util.Scanner ; public class atcoder_ABC188_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; if ( n == 1 ) { System.out.println ( 0 ) ; return ; } int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { int x = arr [ i ] ; while ( x > 0 ) { if ( x >= i + 1 ) { x -= i + 1 ; count ++ ; } else { break ; } } } System.out.println ( count ) ; } }

```
