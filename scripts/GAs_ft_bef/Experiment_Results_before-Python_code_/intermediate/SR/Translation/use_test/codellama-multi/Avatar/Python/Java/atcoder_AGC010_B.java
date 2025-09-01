 ```java
import java.util.* ; public class codeforces_552_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int sum = 0 ; for ( int i = 0 ; i < n ; i ++ ) { sum += a [ i ] ; } if ( sum % ( n * ( n + 1 ) / 2 ) != 0 ) { System.out.println ( "NO" ) ; return ; } int k = sum / ( n * ( n + 1 ) / 2 ) ; a [ n ] = a [ 0 ] ; int [ ] b = new int [ n + 1 ] ; for ( int i = 1 ; i <= n ; i ++ ) { b [ i ] = ( k - a [ i - 1 ] + a [ i ] ) % n ; } int flag = 0 ; for ( int i = 1 ; i <= n ; i ++ ) { if ( b [ i ] != b [ i - 1 ] ) { flag = 1 ; break ; } } if ( flag == 1 ) { System.out.println ( "NO" ) ; return ; } System.out.println ( "YES" ) ; } }

```
