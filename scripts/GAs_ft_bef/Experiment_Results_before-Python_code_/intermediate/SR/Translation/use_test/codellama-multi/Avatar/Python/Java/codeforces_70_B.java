 ```java
import java.util.Scanner ; import java.util.regex.Pattern ; public class atcoder_ABC164_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; String S = sc.next ( ) ; int count = 0 ; int len = 0 ; for ( String s : S.split ( "\\.|\\?|!" ) ) { s = s + "." ; len = s.length ( ) ; if ( len > N ) { System.out.println ( "Impossible" ) ; return ; } if ( len + len > N ) { count ++ ; len = len ; } else { len += len ; } } System.out.println ( count ) ; } }

```
