 ```java
import java.util.Scanner ; public class atcoder_ABC174_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; long MOD = 1000000007 ; long [ ] [ ] dp = new long [ N + 1 ] [ 4 ] ; for ( int i = 0 ; i <= N ; i ++ ) { for ( int j = 0 ; j < 4 ; j ++ ) { dp [ i ] [ j ] = 0 ; } } dp [ 0 ] [ 0 ] = 1 ; for ( int i = 0 ; i < N ; i ++ ) { for ( int j = 0 ; j < 4 ; j ++ ) { for ( int k = 0 ; k < 4 ; k ++ ) { if ( dp [ i ] [ k ] > 0 ) { if ( ( k + 1 ) % 4 == j ) { dp [ i + 1 ] [ j ] = ( dp [ i + 1 ] [ j ] + dp [ i ] [ k ] ) % MOD ; } else { dp [ i + 1 ] [ ( j + 1 ) % 4 ] = ( dp [ i + 1 ] [ ( j + 1 ) % 4 ] + dp [ i ] [ k ] ) % MOD ; } } } } } System.out.println ( dp [ N ] [ 0 ] ) ; } } }

```
