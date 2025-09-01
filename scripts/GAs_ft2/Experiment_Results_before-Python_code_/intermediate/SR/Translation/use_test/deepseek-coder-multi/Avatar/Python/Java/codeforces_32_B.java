```java
import java.util.Scanner ; public class atcoder_ABC121_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; String ans = "" ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '.' ) { ans += "0" ; } else { i ++ ; if ( s.charAt ( i ) == '.' ) { ans += "1" ; } else { ans += "2" ; } } } System.out.println ( ans ) ; } }

```
