 [java]
import java.util.Scanner ; public class codeforces_200_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int [ ] a = new int [ s.length ( ) + 1 ] ; a [ 0 ] = 0 ; for ( int i = 1 ; i < s.length ( ) ; i ++ ) { a [ i ] = a [ i - 1 ] ; if ( s.charAt ( i - 1 ) == s.charAt ( i ) ) { a [ i ] ++ ; } } int q = sc.nextInt ( ) ; while ( q -- > 0 ) { int m = sc.nextInt ( ) ; int l = sc.nextInt ( ) ; System.out.println ( a [ l - 1 ] - a [ m - 1 ] ) ; } } }

```
