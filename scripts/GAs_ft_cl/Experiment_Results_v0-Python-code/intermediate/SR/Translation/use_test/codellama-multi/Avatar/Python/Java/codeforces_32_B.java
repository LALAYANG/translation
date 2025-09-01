 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; String ans = "" ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { if ( S.charAt ( i ) == '.' ) { ans += "0" ; } else { ans += "2" ; i ++ ; if ( S.charAt ( i ) == '.' ) { ans += "1" ; } else { ans += "2" ; } } } System.out.println ( ans ) ; } }

```
