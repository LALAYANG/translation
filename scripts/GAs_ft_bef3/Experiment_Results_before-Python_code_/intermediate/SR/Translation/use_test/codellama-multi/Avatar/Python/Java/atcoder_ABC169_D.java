 ```java
import java.util.Scanner ; public class atcoder_ABC188_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; if ( n == 1 ) { System.out.println ( 0 ) ; return ; } int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { int x = 0 ; for ( int j = 0 ; j < n ; j ++ ) { if ( arr [ i ] % arr [ j ] == 0 ) { x ++ ; } } ans += x ; } System.out.println ( ans ) ; } }

```
