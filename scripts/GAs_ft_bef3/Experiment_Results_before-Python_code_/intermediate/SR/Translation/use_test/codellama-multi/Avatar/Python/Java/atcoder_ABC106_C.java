 ```java
import java.util.Scanner ; public class atcoder_ABC138_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int l = 0 ; for ( int i = 0 ; i < n ; i ++ ) { char c = sc.next ( ).charAt ( 0 ) ; if ( c != '1' ) break ; l ++ ; } if ( l >= k ) { System.out.println ( 1 ) ; return ; } System.out.println ( sc.next ( ).charAt ( 0 ) ) ; } }

```
