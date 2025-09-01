 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { String s = sc.next ( ) ; for ( int j = 0 ; j < m ; j ++ ) { if ( s.charAt ( j ) == 'S' ) { count ++ ; } else if ( s.charAt ( j ) == 'G' ) { count -- ; } } } System.out.println ( count ) ; } }

```
