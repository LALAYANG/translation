 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int [ ] dp = new int [ 13 ] ; for ( int i = 0 ; i < n ; i ++ ) { if ( i == 0 ) { dp [ a [ i ] ] ++ ; } else { for ( int j = 0 ; j < 13 ; j ++ ) { dp [ ( j * 10 + a [ i ] ) % 13 ] += dp [ j ] ; } } } System.out.println ( dp [ 5 ] ) ; } }

```
