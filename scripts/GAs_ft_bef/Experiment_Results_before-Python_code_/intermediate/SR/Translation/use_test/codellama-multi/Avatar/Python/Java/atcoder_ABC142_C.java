 ```java
import java.util.Scanner ; public class atcoder_ABC172_A { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int N = stdIn.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = stdIn.nextInt ( ) ; } Arrays.sort ( A ) ; for ( int i = 0 ; i < N - 1 ; i ++ ) { System.out.print ( A [ i ] + " " ) ; } System.out.println ( A [ N - 1 ] ) ; } }

```
