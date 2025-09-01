 ```java
import java.io.* ; import java.util.* ; public class atcoder_ABC157_D { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int n = scanner.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = scanner.nextInt ( ) ; } int k = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] > a [ k ] ) { k = i ; } } System.out.println ( k + 1 ) ; } }

```
