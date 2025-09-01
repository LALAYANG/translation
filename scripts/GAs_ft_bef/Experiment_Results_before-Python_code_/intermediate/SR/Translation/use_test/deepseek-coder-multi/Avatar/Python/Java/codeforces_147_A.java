```java
import java.util.* ; import java.io.* ; public class codeforces_26_A { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; String s = in.nextLine ( ) ; String res = "" ; int i = 0 ; while ( i < s.length ( ) ) { if ( s.charAt ( i ) != ' ' ) { res += s.charAt ( i ) ; } else if ( res.charAt ( res.length ( ) - 1 ) != ' ' ) { res += s.charAt ( i ) ; } i ++ ; } System.out.println ( res ) ; } }

```
