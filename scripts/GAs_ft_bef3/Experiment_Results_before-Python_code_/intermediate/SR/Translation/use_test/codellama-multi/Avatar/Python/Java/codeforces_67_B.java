 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < n ; j ++ ) { if ( a [ j ] == 0 ) { System.out.print ( ( j + 1 ) + " " ) ; break ; } } } for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < n ; j ++ ) { if ( a [ j ] == 0 ) { a [ j ] -- ; break ; } else { a [ j ] -- ; } } } } } }

```
