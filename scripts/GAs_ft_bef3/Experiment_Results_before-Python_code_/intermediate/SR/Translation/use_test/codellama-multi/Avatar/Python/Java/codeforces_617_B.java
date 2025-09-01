 ```java
import java.util.Scanner ; public class atcoder_ABC167_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int cnt = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == '1' ) cnt ++ ; } if ( cnt == 0 ) { System.out.println ( 0 ) ; } else { int res = 1 ; for ( int i = 0 ; i < cnt ; i ++ ) { res *= 2 ; } System.out.println ( res - 1 ) ; } } }

```
