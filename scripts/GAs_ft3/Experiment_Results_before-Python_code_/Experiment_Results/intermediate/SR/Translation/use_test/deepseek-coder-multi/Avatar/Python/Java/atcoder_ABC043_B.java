```java
import java.util.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; StringBuilder sb = new StringBuilder ( ) ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '0' || s.charAt ( i ) == '1' ) { sb.append ( s.charAt ( i ) ) ; } else if ( sb.length ( ) != 0 ) { sb.deleteCharAt ( sb.length ( ) - 1 ) ; } } System.out.println ( sb ) ; } }

```
