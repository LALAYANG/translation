 ```java
import java.util.Scanner ; public class atcoder_ABC163_E { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int n = stdIn.nextInt ( ) ; int m = n * ( n + 1 ) / 4 ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = stdIn.nextInt ( ) ; } int [ ] d = new int [ 200001 ] ; int k = 0 ; for ( int i = 0 ; i < 200001 ; i ++ ) { if ( d [ i ] == 0 ) { d [ i ] = ++ k ; } } for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = d [ a [ i ] ] ; } int ans = 0 ; for ( int i = 0 ; i < 200001 ; i ++ ) { int sum = 0 ; for ( int j = 0 ; j < n ; j ++ ) { if ( a [ j ] <= i ) { sum ++ ; } } ans += sum ; } System.out.println ( ans ) ; } }

```
