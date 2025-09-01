 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int ans = 0 ; while ( m >= n ) { m -= n ; ans ++ ; } System.out.println ( m ) ; } }

```
