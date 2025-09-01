 ```java
import java.util.* ; public class atcoder_ABC147_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int K = sc.nextInt ( ) ; int T = 0 ; for ( int i = 1 ; i <= K ; i ++ ) { T = ( T % K ) * 10 + 7 ; if ( T % K == 0 ) { System.out.println ( i ) ; break ; } } if ( T % K != 0 ) { System.out.println ( - 1 ) ; } sc.close ( ) ; } }

```
