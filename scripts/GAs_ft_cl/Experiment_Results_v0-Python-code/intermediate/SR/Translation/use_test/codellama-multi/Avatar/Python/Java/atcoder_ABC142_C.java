 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int [ ] b = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { b [ i ] = a [ i ] ; } Arrays.sort ( b ) ; int [ ] c = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { c [ i ] = b [ i ] ; } int d = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( c [ i ] != a [ i ] ) { d = 1 ; break ; } } if ( d == 1 ) { System.out.println ( "No" ) ; } else { System.out.println ( "Yes" ) ; } } }

```
