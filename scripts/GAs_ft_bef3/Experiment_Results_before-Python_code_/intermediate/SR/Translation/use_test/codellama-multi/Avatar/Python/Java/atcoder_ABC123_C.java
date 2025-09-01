 ```java
import java.util.* ; public class atcoder_ABC177_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int A [ ] = new int [ 5 ] ; for ( int i = 0 ; i < 5 ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } int min = Integer.MAX_VALUE ; for ( int i = 0 ; i < 5 ; i ++ ) { if ( A [ i ] < min ) { min = A [ i ] ; } } System.out.println ( ( N + 4 ) / min + 4 ) ; } }

```
