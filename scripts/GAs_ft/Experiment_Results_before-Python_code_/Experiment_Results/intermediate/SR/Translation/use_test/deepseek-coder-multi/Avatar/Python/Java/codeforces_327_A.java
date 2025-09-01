```
import java.util.* ; public class codeforces_266_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int cnt = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == '1' ) cnt ++ ; } int ans = cnt ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == '0' ) { int j = i ; while ( j < n && s.charAt ( j ) == '0' ) j ++ ; if ( j == n ) break ; int cnt1 = 0 , cnt0 = 0 ; for ( int k = i ; k < j ; k ++ ) { if ( s.charAt ( k ) == '1' ) cnt1 ++ ; else cnt0 ++ ; } ans = Math.max ( ans , cnt + cnt1 + cnt0 ) ; i = j - 1 ; } } System.out.println ( ans ) ; } }

```
