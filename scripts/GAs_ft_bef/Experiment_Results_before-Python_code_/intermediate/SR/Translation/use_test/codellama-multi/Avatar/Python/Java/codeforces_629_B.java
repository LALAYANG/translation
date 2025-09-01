 ```java
import java.util.Scanner ; public class atcoder_ABC169_A { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int n = scanner.nextInt ( ) ; int [ ] m = new int [ 368 ] ; int [ ] f = new int [ 368 ] ; for ( int i = 0 ; i < n ; i ++ ) { char c = scanner.next ( ).charAt ( 0 ) ; int a = scanner.nextInt ( ) ; int b = scanner.nextInt ( ) ; if ( c == 'M' ) { m [ a ] += 2 ; m [ b ] -= 2 ; } else { f [ a ] += 2 ; f [ b ] -= 2 ; } } int a = 0 ; int b = 0 ; int c = 0 ; for ( int i = 0 ; i < 368 ; i ++ ) { a += m [ i ] ; b += f [ i ] ; if ( Math.min ( a , b ) > c ) { c = Math.min ( a , b ) ; } } System.out.println ( c ) ; } }

```
