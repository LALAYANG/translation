```
import java.util.* ; public class atcoder_ABC141_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } long MOD = 1000000007 ; long lcm = 1 ; for ( int i = 0 ; i < N ; i ++ ) { lcm = lcm * A [ i ] / gcd ( lcm , A [ i ] ) ; } long ans = 0 ; for ( int i = 0 ; i < N ; i ++ ) { ans += lcm * pow ( A [ i ] , MOD - 2 , MOD ) ; ans %= MOD ; } System.out.println ( ans ) ; } static long gcd ( long a , long b ) { if ( b == 0 ) return a ; return gcd ( b , a % b ) ; } static long pow ( long x , long n , long mod ) { long res = 1 ; while ( n > 0 ) { if ( ( n & 1 ) == 1 ) res = res * x % mod ; x = x * x % mod ; n >>= 1 ; } return res ; } }

```
