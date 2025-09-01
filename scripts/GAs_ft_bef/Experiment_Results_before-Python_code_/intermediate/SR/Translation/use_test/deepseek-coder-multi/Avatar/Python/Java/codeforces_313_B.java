```
import java.util.* ; public class codeforces_265_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int n = s.length ( ) ; int [ ] dp = new int [ n + 1 ] ; for ( int i = 1 ; i <= n ; i ++ ) { if ( s.charAt ( i - 1 ) == s.charAt ( i ) ) dp [ i ] = dp [ i - 1 ] + 1 ; else dp [ i ] = dp [ i - 1 ] ; } int q = sc.nextInt ( ) ; while ( q -- > 0 ) { int l = sc.nextInt ( ) ; int r = sc.nextInt ( ) ; System.out.println ( dp [ r ] - dp [ l ] ) ; } } }

```
