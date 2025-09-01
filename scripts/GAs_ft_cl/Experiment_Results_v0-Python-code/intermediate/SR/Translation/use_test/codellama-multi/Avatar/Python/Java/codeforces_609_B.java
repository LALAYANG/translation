 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int res = 0 ; int [ ] cnt = new int [ 100001 ] ; for ( int i = 0 ; i < n ; i ++ ) { cnt [ a [ i ] ] ++ ; } for ( int i = 0 ; i < n ; i ++ ) { if ( cnt [ a [ i ] ] > 1 ) { res += n - i - cnt [ a [ i ] ] ; cnt [ a [ i ] ] -- ; } else { res += n - i - 1 ; } } System.out.println ( res ) ; } }

```
