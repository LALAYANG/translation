 ```java
import java.util.Scanner ; public class codeforces_615_A { public static void main ( String [ ] args ) { Scanner scan = new Scanner ( System.in ) ; int n = scan.nextInt ( ) ; int [ ] w = new int [ n ] ; int x = 0 ; for ( int i = 0 ; i < n ; i ++ ) { w [ i ] = scan.nextInt ( ) ; x += w [ i ] ; } int [ ] d = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { if ( ( x - w [ i ] ) / ( n - 1 ) == w [ i ] ) { d [ i ] = i + 1 ; } } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( d [ i ] != 0 ) { count ++ ; } } System.out.println ( count ) ; for ( int i = 0 ; i < n ; i ++ ) { if ( d [ i ] != 0 ) { System.out.print ( d [ i ] + " " ) ; } } System.out.println ( ) ; } }

```
