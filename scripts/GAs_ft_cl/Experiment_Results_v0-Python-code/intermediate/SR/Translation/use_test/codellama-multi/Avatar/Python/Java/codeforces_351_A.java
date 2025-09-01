 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; double [ ] arr = new double [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextDouble ( ) ; } double sum = 0 ; for ( int i = 0 ; i < n ; i ++ ) { sum += arr [ i ] - ( int ) arr [ i ] ; } double ans = 2000000000.0 ; for ( int i = 0 ; i <= n ; i ++ ) { if ( i + sum >= n ) { ans = Math.min ( ans , Math.abs ( i - sum ) ) ; } } System.out.println ( String.format ( "%.3f" , ans ) ) ; } }

```
