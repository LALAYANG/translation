 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; int ans = 0 ; int A = 0 ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { if ( S.charAt ( i ) == 'A' ) { A ++ ; } else if ( S.charAt ( i ) == 'B' ) { if ( i + 1 < S.length ( ) && S.charAt ( i + 1 ) == 'C' ) { ans ++ ; i ++ ; } else { ans ++ ; } } else { ans ++ ; } } System.out.println ( ans ) ; } }

```
