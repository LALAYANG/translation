```java
import java.util.* ; public class codeforces_581_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int cnt = 0 ; int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == '1' ) { cnt ++ ; } else { if ( cnt > 0 ) { ans += cnt ; cnt = 0 ; } } } if ( cnt > 0 ) { ans += cnt ; } System.out.println ( ans ) ; } }

```
