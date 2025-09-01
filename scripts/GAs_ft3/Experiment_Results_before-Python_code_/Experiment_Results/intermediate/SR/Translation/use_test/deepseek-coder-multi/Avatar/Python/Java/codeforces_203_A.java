```
import java.util.* ; public class codeforces_266_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int t = sc.nextInt ( ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int da = sc.nextInt ( ) ; int db = sc.nextInt ( ) ; int x = 0 ; int y = 0 ; for ( int i = 0 ; i < t ; i ++ ) { x += da ; y += db ; if ( x == n || y == n || x + y == n ) { System.out.println ( "YES" ) ; return ; } } System.out.println ( "NO" ) ; } }

```
