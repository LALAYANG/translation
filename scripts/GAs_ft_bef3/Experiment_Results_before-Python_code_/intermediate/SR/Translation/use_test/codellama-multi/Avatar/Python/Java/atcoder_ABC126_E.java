 ```java
import java.util.Scanner ; public class atcoder_ABC177_C { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int M = sc.nextInt ( ) ; int [ ] [ ] edge = new int [ N ] [ ] ; for ( int i = 0 ; i < M ; i ++ ) { int X = sc.nextInt ( ) ; int Y = sc.nextInt ( ) ; X -- ; Y -- ; edge [ X ] [ 0 ] = Y ; edge [ Y ] [ 0 ] = X ; } int [ ] used = new int [ N ] ; int ans = 0 ; for ( int i = 0 ; i < N ; i ++ ) { if ( used [ i ] == 0 ) { ans ++ ; int queue = 1 ; used [ i ] = 1 ; while ( queue != 0 ) { int node = queue ; queue = 0 ; for ( int nextnode : edge [ node ] ) { if ( used [ nextnode ] == 0 ) { used [ nextnode ] = 1 ; queue = nextnode ; break ; } } } } } System.out.println ( ans ) ; } } }

```
