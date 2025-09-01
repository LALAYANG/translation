 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] S = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { S [ i ] = sc.nextInt ( ) ; } int [ ] flag = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { flag [ i ] = 1 ; } int [ ] cur = new int [ 1 ] ; cur [ 0 ] = S [ 0 ] ; flag [ 0 ] = 0 ; for ( int i = 1 ; i < N ; i ++ ) { int j = 0 ; int jM = cur.length ; for ( int k = 0 ; k < N ; k ++ ) { if ( flag [ k ] == 1 && S [ k ] < cur [ j ] ) { cur [ j + 1 ] = S [ k ] ; j ++ ; flag [ k ] = 0 ; if ( j == jM ) { break ; } } } if ( j != jM ) { System.out.println ( "No" ) ; return ; } cur [ 0 ] = cur [ j ] ; } System.out.println ( "Yes" ) ; } }

```
