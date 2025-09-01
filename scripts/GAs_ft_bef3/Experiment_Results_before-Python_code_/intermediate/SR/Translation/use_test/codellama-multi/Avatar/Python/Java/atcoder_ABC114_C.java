 ```java
import java.util.Scanner ; public class codeforces_348_A { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int N = in.nextInt ( ) ; int ans = 0 ; for ( int i = 0 ; i <= N ; i ++ ) { if ( i % 7 == 0 || i % 5 == 0 || i % 3 == 0 ) { ans ++ ; } } System.out.println ( ans ) ; } }

```
