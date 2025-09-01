 ```java
import java.util.Scanner ; public class codeforces_550_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int [ ] perm = new int [ n ] ; int cnt = 0 ; for ( int i = 0 ; i < n ; i ++ ) { int x = 0 ; for ( int j = 0 ; j < n ; j ++ ) { if ( arr [ j ] == i + 1 ) { x = 1 ; break ; } } if ( x == 0 ) { perm [ cnt ++ ] = i + 1 ; } } int p = 0 , q = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( perm [ i ] == arr [ p ] ) { p ++ ; } else if ( perm [ i ] == arr [ q ] ) { q ++ ; } } System.out.println ( Math.abs ( p - q ) ) ; } }

```
