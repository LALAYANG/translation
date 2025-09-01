```
import java.util.* ; public class atcoder_ABC151_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; String S = sc.next ( ) ; String T = sc.next ( ) ; if ( S.equals ( T ) ) { System.out.println ( N ) ; return ; } int cnt = 0 ; for ( int i = 0 ; i < N ; i ++ ) { StringBuilder sb = new StringBuilder ( ) ; for ( int j = 0 ; j < N ; j ++ ) { sb.append ( S.charAt ( ( i + j ) % N ) ) ; } if ( sb.toString ( ).equals ( T ) ) { cnt = i ; break ; } } System.out.println ( 2 * N - cnt ) ; } }

```
