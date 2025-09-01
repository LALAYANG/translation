 ```java
import java.util.* ; public class codeforces_477_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; long x = sc.nextLong ( ) ; long [ ] a = new long [ n ] ; long [ ] [ ] b = new long [ n ] [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextLong ( ) ; } for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < n ; j ++ ) { int k = i - j ; if ( k < 0 ) { k += n ; } b [ i ] [ j ] = Math.min ( b [ i ] [ j ] , a [ k ] ) ; } } long m = ( long ) 1e15 ; for ( int i = 0 ; i < n ; i ++ ) { m = Math.min ( m , Arrays.stream ( b [ i ] ).sum ( ) + x * i ) ; } System.out.println ( m ) ; } }

```
