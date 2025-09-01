 ```java
import java.util.Scanner ; public class atcoder_ABC167_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.nextLine ( ) ; int upper = 0 , lower = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { char c = s.charAt ( i ) ; if ( c >= 'a' && c <= 'z' ) { lower ++ ; } else { upper ++ ; } } if ( upper > lower ) { s = s.toUpperCase ( ) ; } else { s = s.toLowerCase ( ) ; } System.out.println ( s ) ; } }

```
