```java
import java.util.* ; import java.io.* ; public class codeforces_26_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } Arrays.sort ( a ) ; int ans = 0 ; int pre = Integer.MAX_VALUE ; for ( int i = 0 ; i < n ; i ++ ) { if ( pre == 0 ) break ; ans += Math.min ( pre , a [ i ] ) ; pre = Math.max ( 0 , pre - 1 ) ; } System.out.println ( ans ) ; } }

```
