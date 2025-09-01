 ```java
import java.util.Scanner ; public class atcoder_ABC161_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; int A = 0 ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { if ( S.charAt ( i ) == 'A' ) { A ++ ; } else if ( S.charAt ( i ) == 'B' ) { if ( i < S.length ( ) - 1 && S.charAt ( i + 1 ) == 'C' ) { A ++ ; i ++ ; } else { A = 0 ; } } else { A = 0 ; } } System.out.println ( A ) ; } }

```
