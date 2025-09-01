```java
import java.util.* ; import java.io.* ; public class atcoder_ABC152_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int ans = 0 ; int i = 1 ; while ( true ) { if ( N < 10 * i ) { ans += N - 10 * ( i - 1 ) + 1 ; break ; } else { ans += 9 * i + 1 ; i ++ ; } } System.out.println ( ans ) ; } }

```
