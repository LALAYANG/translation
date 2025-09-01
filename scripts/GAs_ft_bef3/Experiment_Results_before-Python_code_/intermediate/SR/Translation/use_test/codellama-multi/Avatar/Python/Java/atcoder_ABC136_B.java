 ```java
import java.util.Scanner ; public class atcoder_ABC120_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int ans = 0 ; int i = 1 ; while ( 10 * i <= N ) { ans += ( 10 * i - 10 * ( i - 1 ) ) ; i += 2 ; } ans += Math.max ( 0 , N - 10 * ( i - 1 ) + 1 ) ; System.out.println ( ans ) ; } }

```
