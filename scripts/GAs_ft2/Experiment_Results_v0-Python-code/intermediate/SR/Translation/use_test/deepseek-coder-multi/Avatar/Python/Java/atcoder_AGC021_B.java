```

```

```java
import java.util.* ; import java.io.* ; import java.math.* ; public class atcoder_ABC151_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] x = new int [ N ] ; int [ ] y = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { x [ i ] = sc.nextInt ( ) ; y [ i ] = sc.nextInt ( ) ; } double [ ] rad = new double [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { for ( int j = 0 ; j < N ; j ++ ) { if ( i == j ) continue ; rad [ i ] = Math.atan2 ( x [ j ] - x [ i ] , y [ j ] - y [ i ] ) ; } } Arrays.sort ( rad ) ; double ans = 0 ; for ( int i = 0 ; i < N ; i ++ ) { ans = Math.max ( ans , rad [ i ] - rad [ i - 1 ] ) ; } ans = Math.max ( ans , 2 * Math.PI - rad [ N - 1 ] + rad [ 0 ] ) ; System.out.println ( ans * 180 / Math.PI ) ; } }

```
