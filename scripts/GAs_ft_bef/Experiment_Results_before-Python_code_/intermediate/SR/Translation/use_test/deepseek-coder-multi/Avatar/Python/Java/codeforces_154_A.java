```
import java.util.* ; public class atcoder_ABC150_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int n = sc.nextInt ( ) ; int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { String t = sc.next ( ) ; int a = 0 ; int b = 0 ; for ( int j = 0 ; j < s.length ( ) ; j ++ ) { if ( s.charAt ( j ) == t.charAt ( 0 ) ) a ++ ; else if ( s.charAt ( j ) == t.charAt ( 1 ) ) b ++ ; else { ans += Math.min ( a , b ) ; a = 0 ; b = 0 ; } } ans += Math.min ( a , b ) ; } System.out.println ( ans ) ; } }

```
