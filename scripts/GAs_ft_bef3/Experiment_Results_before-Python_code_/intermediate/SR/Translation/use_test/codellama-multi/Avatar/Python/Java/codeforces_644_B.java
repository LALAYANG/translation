 ```java
import java.util.Scanner ; public class atcoder_ABC165_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int [ ] [ ] arr = new int [ n ] [ 2 ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] [ 0 ] = sc.nextInt ( ) ; arr [ i ] [ 1 ] = sc.nextInt ( ) ; } int [ ] res = new int [ n ] ; int idx = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( idx >= b ) { res [ i ] = - 1 ; continue ; } if ( arr [ i ] [ 0 ] >= res [ idx ] ) { res [ i ] = res [ idx ] + arr [ i ] [ 1 ] ; idx ++ ; } else { res [ i ] = - 1 ; } } for ( int i = 0 ; i < res.length ; i ++ ) { System.out.print ( res [ i ] + " " ) ; } } }

```
