 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; String s = sc.next ( ) ; int ans = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '+' ) { ans += b ; } else { ans *= b ; } } ans += a + c ; System.out.println ( ans ) ; } }

```
