```java
import java.util.* ; import java.io.* ; public class codeforces_581_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } Arrays.sort ( a ) ; long ans = 0 ; for ( int i = n - 1 ; i >= 0 ; i -= 2 ) { ans += a [ i ] ; } System.out.println ( ans ) ; } }

```
