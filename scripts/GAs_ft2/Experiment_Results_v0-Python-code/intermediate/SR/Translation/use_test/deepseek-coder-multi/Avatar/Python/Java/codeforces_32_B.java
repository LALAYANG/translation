```
import java.util.* ; public class codeforces_266_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == 'x' && s.charAt ( i + 1 ) == 'x' ) count ++ ; } System.out.println ( count ) ; } }

```
