 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int [ ] dp = new int [ n + 1 ] ; dp [ 0 ] = 1 ; for ( int i = 0 ; i < n ; i ++ ) { dp [ i + 1 ] = ( dp [ i ] + dp [ i ] * a [ i ] ) % 1000000007 ; } System.out.println ( ( dp [ n ] + dp [ n - 1 ] ) % 1000000007 ) ; } }

```
