 ```java
import java.util.Scanner ; public class atcoder_ABC141_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.nextLine ( ) ; int ans = 0 ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { if ( i % 2 == 0 ) { if ( S.charAt ( i ) == '0' ) { ans ++ ; } } else { if ( S.charAt ( i ) == '1' ) { ans ++ ; } } } System.out.println ( ans ) ; } }

```
