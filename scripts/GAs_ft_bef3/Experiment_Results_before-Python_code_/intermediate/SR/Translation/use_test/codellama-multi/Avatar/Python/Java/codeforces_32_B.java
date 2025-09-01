 ```java
import java.util.Scanner ; public class codeforces_624_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; String res = "" ; int i = 0 ; while ( i < S.length ( ) ) { if ( S.charAt ( i ) == '.' ) res += "0" ; else { i ++ ; if ( S.charAt ( i ) == '.' ) res += "1" ; else res += "2" ; } i ++ ; } System.out.println ( res ) ; } }

```
