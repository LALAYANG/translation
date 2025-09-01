 ```java
import java.util.Scanner ; public class atcoder_ABC128_C { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int t = sc.nextInt ( ) ; while ( t -- > 0 ) { String s = sc.next ( ) ; int flag = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == 'a' ) { flag ++ ; } else if ( s.charAt ( i ) == 'b' ) { flag -- ; } } if ( flag == 0 ) { System.out.println ( "AC" ) ; } else { System.out.println ( "WA" ) ; } } } }

```
