```java
import java.util.* ; import java.io.* ; public class codeforces_581_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < n ; j ++ ) { if ( i == j ) continue ; for ( int k = 0 ; k < n ; k ++ ) { if ( i == k || j == k ) continue ; if ( arr [ i ] + arr [ j ] == arr [ k ] ) { System.out.println ( ( i + 1 ) + " " + ( j + 1 ) + " " + ( k + 1 ) ) ; return ; } } } } System.out.println ( - 1 ) ; } }

```
