 ```java
import java.util.Scanner ; public class atcoder_ABC161_A { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; String S = stdIn.next ( ) ; String result = "" ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { if ( S.charAt ( i ) == '.' ) { result += "0" ; } else { i ++ ; if ( S.charAt ( i ) == '.' ) { result += "1" ; } else { result += "2" ; } } } System.out.println ( result ) ; } }

```
