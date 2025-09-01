 ```java
import java.util.Collections ; import java.util.Scanner ; public class atcoder_AGC040_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int even = 0 ; int odd = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( i % 2 == 0 ) { if ( s.charAt ( i ) == '0' ) { even ++ ; } else { odd ++ ; } } else { if ( s.charAt ( i ) == '1' ) { even ++ ; } else { odd ++ ; } } } int res = Math.min ( s.length ( ) - even - odd , s.length ( ) - even + odd ) ; System.out.println ( res ) ; } }

```
