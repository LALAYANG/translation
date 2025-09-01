 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] V = new int [ N ] ; int [ ] C = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { V [ i ] = sc.nextInt ( ) ; C [ i ] = sc.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < N ; i ++ ) { if ( V [ i ] - C [ i ] > 0 ) { ans += V [ i ] - C [ i ] ; } } System.out.println ( ans ) ; } }

```
