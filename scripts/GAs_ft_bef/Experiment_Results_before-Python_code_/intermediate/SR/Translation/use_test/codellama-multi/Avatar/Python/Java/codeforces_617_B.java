 ```java
import java.util.Scanner ; public class atcoder_ABC167_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int cnt = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == '1' ) cnt ++ ; } if ( cnt == 0 ) { System.out.println ( 0 ) ; } else { int ans = 1 ; for ( int i = 0 ; i < n - cnt ; i ++ ) { if ( s.charAt ( i ) == '0' ) ans *= 2 ; } System.out.println ( ans ) ; } } }

```
