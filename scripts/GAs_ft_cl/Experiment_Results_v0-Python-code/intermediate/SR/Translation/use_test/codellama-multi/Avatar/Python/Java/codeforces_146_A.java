 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int h1 = 0 ; int h2 = 0 ; int x = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] != 4 && arr [ i ] != 7 ) { System.out.println ( "NO" ) ; x = 1 ; break ; } if ( i < n / 2 ) { h1 += arr [ i ] ; } else { h2 += arr [ i ] ; } } if ( x == 0 ) { if ( h1 == h2 ) { System.out.println ( "YES" ) ; } else { System.out.println ( "NO" ) ; } } } }

```
