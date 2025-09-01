 ```java
import java.util.Scanner ; public class atcoder_ABC157_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int ans = 0 ; for ( int i = 1 ; i <= N ; i ++ ) { if ( N % i == 0 ) { ans += i ; } } System.out.println ( ans ) ; } }

```
