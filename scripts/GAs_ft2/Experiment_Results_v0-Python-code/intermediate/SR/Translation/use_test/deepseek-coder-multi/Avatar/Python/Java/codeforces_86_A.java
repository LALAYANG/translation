```
import java.util.* ; public class codeforces_584_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int l = sc.nextInt ( ) ; int r = sc.nextInt ( ) ; int ans = - 1 ; for ( int i = l ; i <= r ; i ++ ) { int x = i ; int y = 0 ; while ( x > 0 ) { y = y * 10 + ( 9 - ( x % 10 ) ) ; x /= 10 ; } ans = Math.max ( ans , i * y ) ; } System.out.println ( ans ) ; } }

```
