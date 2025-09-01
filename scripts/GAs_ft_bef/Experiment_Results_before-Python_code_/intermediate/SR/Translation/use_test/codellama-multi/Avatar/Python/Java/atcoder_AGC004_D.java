 [INST:java]
import java.util.Scanner ; public class atcoder_ABC167_B { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int n = scanner.nextInt ( ) ; int k = scanner.nextInt ( ) ; int [ ] parent = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { parent [ i ] = scanner.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( parent [ i ] == 0 ) { continue ; } int depth = 1 ; int j = parent [ i ] ; while ( parent [ j ] != 0 ) { depth ++ ; j = parent [ j ] ; } if ( depth == k ) { ans ++ ; } } if ( parent [ 0 ] != 1 ) { ans ++ ; } System.out.println ( ans ) ; } }

```
