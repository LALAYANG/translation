 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int sum = 0 ; for ( int i = 0 ; i < n ; i ++ ) { sum += a [ i ] ; } if ( sum % ( n * ( n + 1 ) / 2 ) != 0 ) { System.out.println ( "NO" ) ; } else { int k = sum / ( n * ( n + 1 ) / 2 ) ; a [ n ] = a [ 0 ] ; int sum1 = 0 ; for ( int i = 1 ; i <= n ; i ++ ) { sum1 += ( k - a [ i - 1 ] + a [ i ] ) % n ; } if ( sum1 != 0 || sum1 / n != n ) { System.out.println ( "NO" ) ; } else { System.out.println ( "YES" ) ; } } } }

```
