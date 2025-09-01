 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] round = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { round [ i ] = sc.nextInt ( ) ; } int [ ] george = new int [ m ] ; for ( int i = 0 ; i < m ; i ++ ) { george [ i ] = sc.nextInt ( ) ; } int i = 0 ; int j = 0 ; while ( i < n && j < m ) { if ( round [ i ] <= george [ j ] ) { i ++ ; } j ++ ; } System.out.println ( n - i ) ; } }

```
