 [INST:perfect]
```
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] [ ] arr = new int [ n ] [ 2 ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] [ 0 ] = sc.nextInt ( ) ; arr [ i ] [ 1 ] = sc.nextInt ( ) ; } int max = arr [ 0 ] [ 1 ] ; for ( int i = 1 ; i < n ; i ++ ) { if ( arr [ i ] [ 1 ] > max ) { System.out.println ( "Happy Alex" ) ; return ; } max = Math.max ( max , arr [ i ] [ 1 ] ) ; } System.out.println ( "Poor Alex" ) ; } }

```
