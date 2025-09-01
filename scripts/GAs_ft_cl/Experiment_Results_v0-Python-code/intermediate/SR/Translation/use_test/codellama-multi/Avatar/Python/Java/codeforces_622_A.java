 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int l = 1 ; int r = N ; while ( l < r ) { int m = ( l + r ) / 2 ; int idxcnt = m * ( m + 1 ) / 2 ; if ( idxcnt <= N ) { l = m + 1 ; } else { r = m ; } } l -- ; int idxcnt = l * ( l + 1 ) / 2 ; System.out.println ( N - idxcnt ) ; } }

```
