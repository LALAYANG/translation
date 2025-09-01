 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int [ ] dp = new int [ n ] ; dp [ n - 1 ] = 0 ; int max = arr [ n - 1 ] ; for ( int i = n - 2 ; i >= 0 ; i -- ) { dp [ i ] = Math.max ( 0 , max - arr [ i ] + 1 ) ; if ( arr [ i ] > max ) { max = arr [ i ] ; } } for ( int i = 0 ; i < n ; i ++ ) { System.out.print ( dp [ i ] + " " ) ; } } }

```
