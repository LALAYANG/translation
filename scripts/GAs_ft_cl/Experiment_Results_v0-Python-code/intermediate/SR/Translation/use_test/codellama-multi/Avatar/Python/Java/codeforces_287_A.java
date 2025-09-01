 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int [ ] [ ] arr = new int [ 4 ] [ 4 ] ; for ( int i = 0 ; i < 4 ; i ++ ) { for ( int j = 0 ; j < 4 ; j ++ ) { arr [ i ] [ j ] = sc.nextInt ( ) ; } } int count = 0 ; for ( int i = 0 ; i < 3 ; i ++ ) { for ( int j = 0 ; j < 3 ; j ++ ) { if ( arr [ i ] [ j ] == 1 ) { count ++ ; } if ( arr [ i ] [ j + 1 ] == 1 ) { count ++ ; } if ( arr [ i + 1 ] [ j ] == 1 ) { count ++ ; } if ( arr [ i + 1 ] [ j + 1 ] == 1 ) { count ++ ; } if ( count == 0 || count == 4 ) { System.out.println ( "NO" ) ; return ; } } count = 0 ; } System.out.println ( "YES" ) ; } }

```
