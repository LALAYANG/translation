 ```java
import java.util.Scanner ; public class atcoder_ABC157_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int [ ] b = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { b [ i ] = a [ i ] ; } Arrays.sort ( b ) ; boolean flag = false ; for ( int i = 0 ; i < n ; i ++ ) { if ( b [ i ] + 1 < b [ n - 1 ] && b [ i ] + 2 < b [ n - 1 ] ) { flag = true ; break ; } } if ( flag ) { System.out.println ( "YES" ) ; } else { System.out.println ( "NO" ) ; } } }

```
