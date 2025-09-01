 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] [ ] a = new int [ n ] [ 2 ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] [ 0 ] = sc.nextInt ( ) ; a [ i ] [ 1 ] = sc.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < n ; j ++ ) { if ( i == j ) continue ; if ( a [ i ] [ 0 ] == a [ j ] [ 1 ] ) { ans ++ ; } } } System.out.println ( ans ) ; } }

```
