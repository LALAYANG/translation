```java
import java.util.* ; import java.io.* ; public class codeforces_231_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] [ ] arr = new int [ n ] [ 4 ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] [ 0 ] = sc.nextInt ( ) ; arr [ i ] [ 1 ] = sc.nextInt ( ) ; arr [ i ] [ 2 ] = sc.nextInt ( ) ; arr [ i ] [ 3 ] = sc.nextInt ( ) ; } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < n ; j ++ ) { if ( arr [ i ] [ 0 ] < arr [ j ] [ 0 ] && arr [ i ] [ 1 ] < arr [ j ] [ 1 ] && arr [ i ] [ 2 ] < arr [ j ] [ 2 ] ) { count ++ ; break ; } } } System.out.println ( n - count ) ; } }

```
