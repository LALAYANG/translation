```
import java.util.* ; public class codeforces_581_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int cnt = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '1' ) cnt ++ ; } int ans = s.length ( ) - cnt ; if ( cnt > s.length ( ) - cnt ) ans = s.length ( ) - cnt ; System.out.println ( ans ) ; } }

```
