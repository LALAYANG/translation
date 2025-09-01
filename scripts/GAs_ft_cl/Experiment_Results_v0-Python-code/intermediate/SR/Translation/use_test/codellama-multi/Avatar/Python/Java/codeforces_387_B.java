 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int [ ] b = new int [ m ] ; for ( int i = 0 ; i < m ; i ++ ) { b [ i ] = sc.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] <= b [ 0 ] ) { ans ++ ; } else { break ; } } System.out.println ( ans ) ; } }

```
