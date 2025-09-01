 ```java
import java.io.* ; import java.util.* ; public class atcoder_ABC157_F { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int n = scanner.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = scanner.nextInt ( ) ; } int k = 0 ; for ( int i = 0 ; i < n ; i ++ ) { k = Math.max ( k , a [ i ] ) ; } if ( k >= n ) { System.out.println ( n ) ; } else { if ( ( k + 1 ) >= n ) { System.out.println ( n - 1 ) ; } else { System.out.println ( n - ( k + 1 ) ) ; } } } }

```
