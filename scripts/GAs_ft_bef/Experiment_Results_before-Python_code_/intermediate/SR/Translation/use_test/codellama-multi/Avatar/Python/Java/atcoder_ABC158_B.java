 ```java
import java.util.Scanner ; public class atcoder_ABC125_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int A = sc.nextInt ( ) ; int B = sc.nextInt ( ) ; int ans = 0 ; int rep = N / ( A + B ) ; ans += rep * A ; int res = N - rep * ( A + B ) ; ans += Math.min ( res , A ) ; System.out.println ( ans ) ; } }

```
