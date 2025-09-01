 ```java
import java.util.Scanner ; public class codeforces_684_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; char [ ] s = sc.next ( ).toCharArray ( ) ; int [ ] count = new int [ 26 ] ; for ( char c : s ) { count [ c - 'A' ] ++ ; } int res = 0 ; for ( int i = 0 ; i < count.length ; i ++ ) { if ( count [ i ] >= k ) { res += k * k ; System.out.println ( res ) ; return ; } k -= count [ i ] ; res += count [ i ] * count [ i ] ; } System.out.println ( res ) ; } }

```
