```
import java.util.Scanner ; public class atcoder_AGC023_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) != s.charAt ( n - 1 - i ) ) { System.out.println ( "No" ) ; return ; } } System.out.println ( "Yes" ) ; } }

```
