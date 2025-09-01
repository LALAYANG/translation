```java
import java.util.Scanner ; import java.util.Arrays ; public class atcoder_ABC133_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } Arrays.sort ( A ) ; long ans = 0 ; long tmp = - 1 ; for ( int i = 0 ; i < N ; i ++ ) { if ( A [ i ] >= tmp ) { ans += A [ i ] - tmp ; tmp ++ ; } } System.out.println ( ans ) ; } }

```
