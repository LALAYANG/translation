
```java
import java.util.Scanner ; public class atcoder_ABC142_C { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int N = in.nextInt ( ) ; int [ ] dp = new int [ N + 1 ] ; dp [ 0 ] = 1 ; for ( int i = 1 ; i <= N ; i ++ ) { if ( ( i - 1 ) % 3 == 0 || i % 10 == 3 ) dp [ i ] = dp [ i - 1 ] ; else dp [ i ] = dp [ i - 1 ] + 1 ; } System.out.println ( dp [ N ] ) ; } }

```
