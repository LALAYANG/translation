 ```java
import java.util.Scanner ; public class codeforces_221_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int p = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; int t = sc.nextInt ( ) ; int f = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; if ( d <= p ) { System.out.println ( 0 ) ; return ; } int result = 0 ; int position = t * p ; position += p * position / ( d - p ) ; while ( position < c ) { result ++ ; position += p * position / d ; position += p * f ; position += p * position / ( d - p ) ; } System.out.println ( result ) ; } }

```
