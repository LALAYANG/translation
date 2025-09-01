```java
import java.util.* ; public class atcoder_AGC007_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } long lcm = 1 ; for ( int i = 0 ; i < N ; i ++ ) { lcm = lcm * A [ i ] / gcd ( lcm , A [ i ] ) ; } long ans = 0 ; for ( int i = 0 ; i < N ; i ++ ) { ans += lcm / A [ i ] ; } ans %= 1000000007 ; System.out.println ( ans ) ; } public static long gcd ( long a , long b ) { if ( b == 0 ) return a ; return gcd ( b , a % b ) ; } }

```
