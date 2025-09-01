 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int T = sc.nextInt ( ) ; int [ ] [ ] timeValue = new int [ N + 1 ] [ 2 ] ; for ( int i = 1 ; i <= N ; i ++ ) { timeValue [ i ] [ 0 ] = sc.nextInt ( ) ; timeValue [ i ] [ 1 ] = sc.nextInt ( ) ; } for ( int i = 1 ; i <= N ; i ++ ) { for ( int j = 1 ; j <= T ; j ++ ) { if ( timeValue [ i ] [ 0 ] > j ) { timeValue [ i ] [ 1 ] += timeValue [ i - 1 ] [ 1 ] ; } else { timeValue [ i ] [ 1 ] = Math.max ( timeValue [ i ] [ 1 ] , timeValue [ i - 1 ] [ 1 ] + timeValue [ i - 1 ] [ 0 ] ) ; } } } int ans = 0 ; for ( int i = 1 ; i <= N ; i ++ ) { ans += timeValue [ i ] [ 1 ] ; } System.out.println ( ans ) ; } }

```
