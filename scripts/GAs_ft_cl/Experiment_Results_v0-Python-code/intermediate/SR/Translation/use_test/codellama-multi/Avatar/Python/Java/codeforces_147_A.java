 [INST:java]
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; StringBuilder sb = new StringBuilder ( ) ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { if ( i > 0 && S.charAt ( i ) == ' ' && S.charAt ( i - 1 ) == ' ' ) continue ; sb.append ( S.charAt ( i ) ) ; } System.out.println ( sb.toString ( ) ) ; } }

```
