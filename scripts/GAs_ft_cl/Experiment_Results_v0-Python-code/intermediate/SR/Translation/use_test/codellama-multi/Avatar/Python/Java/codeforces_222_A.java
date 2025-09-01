 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } if ( arr [ 0 ] == arr [ n - 1 ] && k == 1 ) { System.out.println ( 0 ) ; return ; } if ( k == 1 ) { System.out.println ( - 1 ) ; return ; } if ( arr [ k - 1 ] != arr [ n - 1 ] ) { System.out.println ( - 1 ) ; return ; } int target = arr [ n - 1 ] ; int count = 0 ; for ( int i = 0 ; i < k - 1 ; i ++ ) { if ( arr [ i ] == target ) { count ++ ; } } System.out.println ( count ) ; } }

```
