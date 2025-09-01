```java
import java.util.* ; import java.io.* ; public class codeforces_510_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int count = 0 ; for ( int i = k - 1 ; i >= 0 ; i -- ) { if ( arr [ i ] != arr [ k - 1 ] ) { break ; } count ++ ; } if ( arr [ k - 1 ] == 1 ) { for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] != 1 ) { count = - 1 ; break ; } } } System.out.println ( count ) ; } }

```
