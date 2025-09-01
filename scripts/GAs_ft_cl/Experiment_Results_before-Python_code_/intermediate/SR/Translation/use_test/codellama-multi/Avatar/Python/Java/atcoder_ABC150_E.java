 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] c = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { c [ i ] = sc.nextInt ( ) ; } int mod = 1000000007 ; int b = 1 ; for ( int i = 0 ; i < 2 * n - 2 ; i ++ ) { b = ( b * 2 ) % mod ; } int a = 2 * b % mod ; long ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { ans += c [ i ] * ( a + i * b ) ; ans %= mod ; } System.out.println ( ans ) ; } }

```
