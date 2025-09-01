```
import java.util.* ; import java.io.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int ans = 1 ; int sum = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == ' ' ) continue ; sum ++ ; if ( sum > n ) { ans ++ ; sum = 1 ; } } System.out.println ( ans ) ; } }

```
