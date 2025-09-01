 ```java
import java.util.Scanner ; public class atcoder_ABC138_C { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; String ans = "" ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { if ( S.charAt ( i ) == '0' || S.charAt ( i ) == '1' ) { ans += S.charAt ( i ) ; } else if ( S.charAt ( i ) == 'B' && ans.length ( ) != 0 ) { ans = ans.substring ( 0 , ans.length ( ) - 1 ) ; } } System.out.println ( ans ) ; } }

```
