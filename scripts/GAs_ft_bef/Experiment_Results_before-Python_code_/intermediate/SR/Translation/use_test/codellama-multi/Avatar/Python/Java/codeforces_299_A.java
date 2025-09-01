 ```java
import java.util.Scanner ; public class codeforces_299_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } Arrays.sort ( a ) ; int gcd = a [ 0 ] ; for ( int i = 1 ; i < n ; i ++ ) { if ( a [ i ] % gcd != 0 ) { gcd = - 1 ; break ; } } System.out.println ( gcd ) ; } }

```
