
```
import java.util.* ; import java.io.* ; public class codeforces_412_B { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int n = in.nextInt ( ) ; int [ ] m = new int [ 370 ] ; int [ ] f = new int [ 370 ] ; for ( int i = 0 ; i < n ; i ++ ) { char c = in.next ( ).charAt ( 0 ) ; int x = in.nextInt ( ) ; int y = in.nextInt ( ) ; if ( c == 'M' ) { m [ x ] += 2 ; m [ y + 1 ] -= 2 ; } else { f [ x ] += 2 ; f [ y + 1 ] -= 2 ; } } int m_sum = 0 ; int f_sum = 0 ; int best = 0 ; for ( int i = 0 ; i < 370 ; i ++ ) { m_sum += m [ i ] ; f_sum += f [ i ] ; best = Math.max ( best , Math.min ( m_sum , f_sum ) ) ; } System.out.println ( best ) ; } }

```
