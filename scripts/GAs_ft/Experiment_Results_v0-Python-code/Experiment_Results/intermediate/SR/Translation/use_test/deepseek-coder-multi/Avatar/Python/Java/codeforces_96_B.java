```java
import java.util.* ; import java.io.* ; public class codeforces_584_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; long n = sc.nextLong ( ) ; long ans = 0 ; for ( long i = 1 ; i <= 1000000000 ; i *= 10 ) { if ( n >= i * 4 ) { ans += i * 4 ; } else if ( n >= i * 7 ) { ans += i * 7 ; } else { ans += n ; break ; } } System.out.println ( ans ) ; } }

```
