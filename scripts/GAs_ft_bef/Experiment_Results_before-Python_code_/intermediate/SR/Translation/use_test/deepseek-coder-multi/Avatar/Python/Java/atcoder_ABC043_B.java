```
import java.util.* ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String str = sc.next ( ) ; StringBuilder sb = new StringBuilder ( ) ; for ( int i = 0 ; i < str.length ( ) ; i ++ ) { if ( str.charAt ( i ) == '0' || str.charAt ( i ) == '1' ) { sb.append ( str.charAt ( i ) ) ; } else if ( sb.length ( ) != 0 ) { sb.deleteCharAt ( sb.length ( ) - 1 ) ; } } System.out.println ( sb.toString ( ) ) ; } }

```
