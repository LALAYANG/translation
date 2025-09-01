```
import java.util.Scanner ; public class atcoder_ABC121_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int K = sc.nextInt ( ) ; int X = sc.nextInt ( ) ; int W = sc.nextInt ( ) ; int sum = 0 ; for ( int i = 0 ; i < W ; i ++ ) { sum += ( i + 1 ) * K ; } if ( sum > X ) { System.out.println ( sum - X ) ; } else { System.out.println ( 0 ) ; } } }

```
