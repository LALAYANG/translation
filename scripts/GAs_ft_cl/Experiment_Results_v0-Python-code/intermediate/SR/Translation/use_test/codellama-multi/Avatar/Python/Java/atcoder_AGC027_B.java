 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int X = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } int sum = 0 ; for ( int i = 0 ; i < N ; i ++ ) { sum += A [ i ] ; } int ans = ( int ) 1e9 + 1 ; for ( int k = 1 ; k <= N ; k ++ ) { int tmp = k * X + 2 * sum ; ans = Math.min ( ans , tmp ) ; } System.out.println ( ans + N * X + 5 * A [ N - 1 ] ) ; } }

```
