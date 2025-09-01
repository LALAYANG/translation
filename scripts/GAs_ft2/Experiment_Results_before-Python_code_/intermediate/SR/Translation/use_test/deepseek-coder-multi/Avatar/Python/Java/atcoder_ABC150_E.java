```java
import java.util.* ; import java.io.* ; public class atcoder_ABC151_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] c = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { c [ i ] = sc.nextInt ( ) ; } Arrays.sort ( c ) ; long mod = 1000000007 ; long ans = 0 ; long b = ( long ) Math.pow ( 2 , 2 * n - 2 ) ; b %= mod ; long a = 2 * b ; a %= mod ; for ( int i = 0 ; i < n ; i ++ ) { ans += c [ i ] * ( a + i * b ) ; ans %= mod ; } System.out.println ( ans ) ; } }

```
