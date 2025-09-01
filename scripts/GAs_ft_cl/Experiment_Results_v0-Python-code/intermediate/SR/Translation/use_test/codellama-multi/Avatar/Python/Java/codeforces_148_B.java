 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int P = sc.nextInt ( ) ; int D = sc.nextInt ( ) ; int T = sc.nextInt ( ) ; int F = sc.nextInt ( ) ; int C = sc.nextInt ( ) ; if ( D <= P ) { System.out.println ( 0 ) ; return ; } int result = 0 ; int position = T * P ; while ( position < C ) { result ++ ; position += P * position / D ; position += P * F ; position += P * position / ( D - P ) ; } System.out.println ( result ) ; } }

```
