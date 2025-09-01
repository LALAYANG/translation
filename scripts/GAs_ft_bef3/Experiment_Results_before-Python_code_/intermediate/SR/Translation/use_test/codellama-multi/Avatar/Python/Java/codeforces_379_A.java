 ```java
import java.util.Scanner ; public class atcoder_ABC123_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int ans = 0 ; for ( int i = 0 ; i < a ; i ++ ) { ans += b ; if ( ans >= 10 ) { ans -= 10 ; } } System.out.println ( ans ) ; } }

```
