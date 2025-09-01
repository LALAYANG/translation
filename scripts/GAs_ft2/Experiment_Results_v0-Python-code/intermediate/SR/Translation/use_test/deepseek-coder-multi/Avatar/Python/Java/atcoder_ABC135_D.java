```java
import java.util.* ; import java.io.* ; public class atcoder_ABC151_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; int N = S.length ( ) ; long [ ] [ ] dp = new long [ N + 1 ] [ 13 ] ; dp [ 0 ] [ 0 ] = 1 ; for ( int i = 0 ; i < N ; i ++ ) { for ( int j = 0 ; j < 10 ; j ++ ) { if ( S.charAt ( i ) != '?' ) { if ( S.charAt ( i ) - '0' == j ) { dp [ i + 1 ] [ ( j * 10 ) % 13 ] += dp [ i ] [ j ] ; } } else { for ( int k = 0 ; k < 10 ; k ++ ) { dp [ i + 1 ] [ ( ( j * 10 + k ) % 13 ) ] += dp [ i ] [ j ] ; } } } } System.out.println ( dp [ N ] [ 5 ] ) ; } }

```
