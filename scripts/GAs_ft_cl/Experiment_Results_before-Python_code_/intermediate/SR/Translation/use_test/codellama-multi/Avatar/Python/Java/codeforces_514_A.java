 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { int a = sc.nextInt ( ) ; if ( a > 4 ) { ans += 9 - a ; } else { ans += a ; } } System.out.println ( ans ) ; } }

```
