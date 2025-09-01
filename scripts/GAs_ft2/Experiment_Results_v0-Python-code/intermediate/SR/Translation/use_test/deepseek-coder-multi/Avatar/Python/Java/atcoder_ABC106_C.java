```
import java.util.* ; public class codeforces_266_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int k = sc.nextInt ( ) ; int cnt = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '1' ) cnt ++ ; else break ; } if ( cnt >= k ) System.out.println ( 1 ) ; else System.out.println ( s.charAt ( cnt ) ) ; } }

```
