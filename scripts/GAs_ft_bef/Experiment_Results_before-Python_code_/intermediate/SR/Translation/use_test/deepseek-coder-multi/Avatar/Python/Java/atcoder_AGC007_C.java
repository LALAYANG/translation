```java
import java.util.* ; import java.io.* ; public class atcoder_ABC189_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; double d = sc.nextDouble ( ) ; double x = sc.nextDouble ( ) ; double ans = 0 ; for ( int i = 0 ; i < N ; i ++ ) { ans += d + ( ( N - 0.5 ) * x ) ; double tmp = d ; d += tmp / ( N - i ) + ( 5 * x ) / ( 2 * ( N - i ) ) ; x += 2 * x / ( N - i ) ; } System.out.println ( ans ) ; } }

```
