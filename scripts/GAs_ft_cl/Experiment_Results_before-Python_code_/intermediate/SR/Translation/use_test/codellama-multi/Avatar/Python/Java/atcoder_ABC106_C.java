 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; int K = sc.nextInt ( ) ; int l = 0 ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { if ( S.charAt ( i ) != '1' ) break ; l ++ ; } if ( l >= K ) return 1 ; return S.charAt ( l ) ; } }

```
