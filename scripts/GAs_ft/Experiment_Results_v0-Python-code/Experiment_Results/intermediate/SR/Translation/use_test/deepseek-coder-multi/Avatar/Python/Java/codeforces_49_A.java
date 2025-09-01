```
import java.util.* ; import java.io.* ; public class codeforces_265_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.nextLine ( ) ; int n = s.length ( ) ; int c = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == 'a' || s.charAt ( i ) == 'e' || s.charAt ( i ) == 'i' || s.charAt ( i ) == 'o' || s.charAt ( i ) == 'u' || s.charAt ( i ) == 'y' || s.charAt ( i ) == 'A' || s.charAt ( i ) == 'E' || s.charAt ( i ) == 'I' || s.charAt ( i ) == 'O' || s.charAt ( i ) == 'U' || s.charAt ( i ) == 'Y' ) { c ++ ; } } if ( c == 0 ) { System.out.println ( "NO" ) ; } else { System.out.println ( "YES" ) ; } } }

```
