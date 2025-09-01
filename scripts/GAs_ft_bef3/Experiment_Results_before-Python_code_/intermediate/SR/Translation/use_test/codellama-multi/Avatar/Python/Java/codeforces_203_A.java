 ```java
import java.util.Scanner ; public class atcoder_ABC141_A { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int x = stdIn.nextInt ( ) ; int t = stdIn.nextInt ( ) ; int a = stdIn.nextInt ( ) ; int b = stdIn.nextInt ( ) ; int da = stdIn.nextInt ( ) ; int db = stdIn.nextInt ( ) ; if ( x == 0 ) { System.out.println ( "YES" ) ; return ; } int aTime = Math.min ( a / da , t - 1 ) ; int bTime = Math.min ( b / db , t - 1 ) ; for ( int i = 0 ; i <= aTime ; i ++ ) { for ( int j = 0 ; j <= bTime ; j ++ ) { if ( a - da * i == x || b - db * j == x ) { System.out.println ( "YES" ) ; return ; } if ( ( a - da * i ) + ( b - db * j ) == x ) { System.out.println ( "YES" ) ; return ; } } } System.out.println ( "NO" ) ; } }

```
