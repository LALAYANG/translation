 ```java
import java.util.Scanner ; public class codeforces_309_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; long [ ] arr = new long [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextLong ( ) ; } long mod = 1000000007 ; long ans = 0 ; long b = ( long ) Math.pow ( 2 , 2 * n - 2 ) ; b = b % mod ; long a = 2 * b % mod ; for ( int i = 0 ; i < n ; i ++ ) { ans = ( ans + arr [ i ] * ( a + i * b ) ) % mod ; } System.out.println ( ans ) ; } }

```
