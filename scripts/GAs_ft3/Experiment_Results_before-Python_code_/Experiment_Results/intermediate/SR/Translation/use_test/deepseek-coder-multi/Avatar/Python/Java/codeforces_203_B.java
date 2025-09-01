```
import java.util.* ; public class codeforces_228_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] [ ] arr = new int [ n ] [ n ] ; int ans = - 1 ; for ( int i = 0 ; i < m ; i ++ ) { int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; arr [ x - 1 ] [ y - 1 ] ++ ; if ( arr [ x - 1 ] [ y - 1 ] == 9 ) { ans = i + 1 ; break ; } } System.out.println ( ans ) ; } }

```
