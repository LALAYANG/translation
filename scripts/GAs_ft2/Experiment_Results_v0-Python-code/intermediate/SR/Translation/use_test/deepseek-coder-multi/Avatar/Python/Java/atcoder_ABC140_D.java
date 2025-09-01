```
import java.util.* ; public class atcoder_ABC131_C { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int K = sc.nextInt ( ) ; String S = sc.next ( ) ; int segCnt = 0 ; for ( int i = 0 ; i < N - 1 ; i ++ ) { if ( S.charAt ( i ) != S.charAt ( i + 1 ) ) { segCnt ++ ; } } int curHappy = N - 1 - segCnt ; if ( 2 * K >= segCnt ) { System.out.println ( N - 1 ) ; } else { System.out.println ( curHappy + 2 * K ) ; } } }

```
