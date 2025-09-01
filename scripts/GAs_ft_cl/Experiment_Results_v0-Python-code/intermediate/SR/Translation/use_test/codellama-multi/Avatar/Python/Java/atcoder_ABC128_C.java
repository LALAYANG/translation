 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] a = new int [ m ] ; int [ ] b = new int [ m ] ; for ( int i = 0 ; i < m ; i ++ ) { a [ i ] = sc.nextInt ( ) ; b [ i ] = sc.nextInt ( ) ; } int [ ] c = new int [ n ] ; for ( int i = 0 ; i < m ; i ++ ) { for ( int j = 0 ; j < a [ i ] ; j ++ ) { c [ sc.nextInt ( ) - 1 ] ++ ; } } int ans = 0 ; for ( int i = 0 ; i < ( 1 << c.length ) ; i ++ ) { int sum = 0 ; for ( int j = 0 ; j < c.length ; j ++ ) { if ( ( i & ( 1 << j ) ) != 0 ) { sum ++ ; } } if ( sum % 2 == b [ sum % 2 ] ) { ans ++ ; } } System.out.println ( ans ) ; } }

```
