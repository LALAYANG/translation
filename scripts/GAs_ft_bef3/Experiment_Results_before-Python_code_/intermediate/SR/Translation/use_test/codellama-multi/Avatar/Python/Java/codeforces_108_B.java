 ```java
import java.util.Scanner ; public class codeforces_293_A { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int n = in.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = in.nextInt ( ) ; } Arrays.sort ( arr ) ; boolean found = false ; for ( int i = 1 ; i < n ; i ++ ) { if ( arr [ i ] != arr [ i - 1 ] && arr [ i ] < arr [ i - 1 ] * 2 ) { found = true ; break ; } } if ( found ) { System.out.println ( "YES" ) ; } else { System.out.println ( "NO" ) ; } } }

```
