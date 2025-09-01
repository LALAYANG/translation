```java
import java.util.Scanner ; public class atcoder_ABC168_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int P = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } int odd = 0 ; int even = 0 ; for ( int i = 0 ; i < N ; i ++ ) { if ( A [ i ] % 2 == 0 ) even ++ ; else odd ++ ; } long ans = 0 ; for ( int i = 0 ; i <= odd ; i ++ ) { if ( i % 2 == P ) { ans += combi ( odd , i ) ; } } ans *= combi ( even , 0 ) ; System.out.println ( ans ) ; } static long combi ( int n , int k ) { long ans = 1 ; for ( int i = n ; i > n - k ; i -- ) { ans *= i ; } for ( int i = 1 ; i <= k ; i ++ ) { ans /= i ; } return ans ; } }

```
