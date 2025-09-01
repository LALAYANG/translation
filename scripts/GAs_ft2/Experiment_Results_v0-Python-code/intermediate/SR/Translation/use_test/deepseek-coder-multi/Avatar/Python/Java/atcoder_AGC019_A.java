```
import java.util.* ; public class atcoder_ABC120_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int q = sc.nextInt ( ) ; int h = sc.nextInt ( ) ; int s = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; int n = sc.nextInt ( ) ; int ans = 0 ; if ( n % 2 == 0 ) { ans = Math.min ( Math.min ( q * 4 , h * 2 ) , s ) ; ans = Math.min ( ans , d ) ; ans = ans * ( n / 2 ) ; } else { ans = Math.min ( Math.min ( q * 4 , h * 2 ) , s ) ; ans = Math.min ( ans , d ) ; ans = ans * ( n / 2 ) ; ans += Math.min ( q * 2 , h ) ; } System.out.println ( ans ) ; } }

```
