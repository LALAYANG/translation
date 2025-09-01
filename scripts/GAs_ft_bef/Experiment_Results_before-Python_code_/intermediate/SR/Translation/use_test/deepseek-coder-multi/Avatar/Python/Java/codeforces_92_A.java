```java
import java.util.Scanner ; public class codeforces_514_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int i = 1 ; while ( m >= i ) { m -= i ; i ++ ; if ( i > n ) i = 1 ; } System.out.println ( m ) ; } }

```
