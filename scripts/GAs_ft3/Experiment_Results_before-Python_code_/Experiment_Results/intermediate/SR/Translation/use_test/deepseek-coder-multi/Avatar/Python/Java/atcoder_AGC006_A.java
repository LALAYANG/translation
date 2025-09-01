```java
import java.util.* ; public class atcoder_ABC151_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; String S = sc.next ( ) ; String T = sc.next ( ) ; if ( S.equals ( T ) ) { System.out.println ( N ) ; return ; } int cnt = 0 ; for ( int i = 0 ; i < N ; i ++ ) { for ( int j = 0 ; j < N - i ; j ++ ) { if ( S.charAt ( i + j ) != T.charAt ( j ) ) { break ; } if ( j == N - i - 1 ) { cnt = N - i ; } } } System.out.println ( 2 * N - cnt ) ; } }

```
