 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] h = new int [ n + 1 ] ; for ( int i = 1 ; i <= n ; i ++ ) { h [ i ] = sc.nextInt ( ) ; } int [ ] [ ] path = new int [ n + 1 ] [ m + 1 ] ; for ( int i = 1 ; i <= m ; i ++ ) { int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; path [ a ] [ i ] = b ; path [ b ] [ i ] = a ; } int ans = 0 ; for ( int i = 1 ; i <= n ; i ++ ) { int flag = 0 ; for ( int j = 1 ; j <= m ; j ++ ) { if ( h [ i ] <= h [ path [ i ] [ j ] ] ) { flag = 1 ; break ; } } if ( flag == 0 ) { ans ++ ; } } System.out.println ( ans ) ; } }

```
