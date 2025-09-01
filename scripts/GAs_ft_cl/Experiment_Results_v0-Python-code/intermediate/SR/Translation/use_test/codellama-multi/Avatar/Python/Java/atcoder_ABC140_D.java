 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int K = sc.nextInt ( ) ; String S = sc.next ( ) ; int seg_cnt = 0 ; for ( int i = 0 ; i < N - 1 ; i ++ ) { if ( S.charAt ( i ) != S.charAt ( i + 1 ) ) { seg_cnt ++ ; } } int ans = N - 1 ; if ( 2 * K >= seg_cnt ) { ans = N - 1 ; } else { ans = N - 1 - seg_cnt + 2 * K ; } System.out.println ( ans ) ; } }

```
