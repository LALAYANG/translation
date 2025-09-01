 ```java
import java.util.Scanner ; public class atcoder_ABC159_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } boolean flag = true ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = i + 1 ; j < n ; j ++ ) { if ( arr [ i ] == arr [ j ] ) { flag = false ; break ; } } if ( ! flag ) break ; } if ( flag ) System.out.println ( "YES" ) ; else System.out.println ( "NO" ) ; } }

```
