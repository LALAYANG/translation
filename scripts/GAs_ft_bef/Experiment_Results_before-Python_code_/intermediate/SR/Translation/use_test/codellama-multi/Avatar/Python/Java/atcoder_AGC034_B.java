 ```java
import java.util.Scanner ; public class atcoder_ABC152_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String str = sc.next ( ) ; int count = 0 ; int prev = 0 ; for ( int i = 0 ; i < str.length ( ) ; i ++ ) { if ( str.charAt ( i ) == 'A' ) { count ++ ; prev = 1 ; } else if ( str.charAt ( i ) == 'B' ) { if ( i < str.length ( ) - 1 && str.charAt ( i + 1 ) == 'C' ) { count ++ ; prev = 2 ; i ++ ; } else { count += prev ; prev = 0 ; } } else { count += prev ; prev = 0 ; } } System.out.println ( count ) ; } }

```
