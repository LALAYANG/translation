 [INST:perfect]
```
import java.util.Scanner ; public class atcoder_ABC138_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] x = new int [ n ] ; int [ ] y = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { x [ i ] = sc.nextInt ( ) ; y [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < n ; i ++ ) { int ans = 0 ; for ( int j = 0 ; j < n ; j ++ ) { if ( i != j ) { double dx = x [ i ] - x [ j ] ; double dy = y [ i ] - y [ j ] ; double theta = Math.atan2 ( dy , dx ) ; double theta2 = theta + 2 * Math.PI ; if ( theta2 >= 2 * Math.PI ) { theta2 = theta2 - 2 * Math.PI ; } if ( theta2 - theta >= Math.PI ) { ans ++ ; } } } System.out.println ( ans / ( double ) n ) ; } } }

```
