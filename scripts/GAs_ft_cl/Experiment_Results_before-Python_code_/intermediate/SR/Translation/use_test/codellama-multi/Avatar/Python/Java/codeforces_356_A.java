 ```java
import java.util.Scanner ; public class codeforces_591_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < m ; i ++ ) { int l = sc.nextInt ( ) ; int r = sc.nextInt ( ) ; int x = sc.nextInt ( ) ; for ( int j = l ; j <= r ; j ++ ) { if ( arr [ j - 1 ] == 0 && j != x ) { arr [ j - 1 ] = x ; } else if ( arr [ j - 1 ] != 0 && j != x ) { arr [ j - 1 ] = r + 1 ; } else if ( arr [ j - 1 ] == 0 && j == x ) { arr [ j - 1 ] = x ; } } } for ( int i = 0 ; i < n ; i ++ ) { System.out.print ( arr [ i ] + " " ) ; } } }

```
