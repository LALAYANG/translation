```java
import java.util.* ; import java.io.* ; public class atcoder_ABC152_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int q = sc.nextInt ( ) ; String s = sc.next ( ) ; int [ ] a = new int [ q ] ; int [ ] b = new int [ q ] ; for ( int i = 0 ; i < q ; i ++ ) { a [ i ] = sc.nextInt ( ) ; b [ i ] = sc.nextInt ( ) ; } int [ ] c = new int [ n + 1 ] ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == 'A' && s.charAt ( i + 1 ) == 'C' ) { c [ i + 1 ] = c [ i ] + 1 ; } else { c [ i + 1 ] = c [ i ] ; } } for ( int i = 0 ; i < q ; i ++ ) { System.out.println ( c [ b [ i ] - 1 ] - c [ a [ i ] - 1 ] ) ; } } }

```
