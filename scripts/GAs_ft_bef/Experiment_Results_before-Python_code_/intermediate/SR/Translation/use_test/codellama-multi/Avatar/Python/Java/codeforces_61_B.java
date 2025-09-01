 ```java
import java.util.Scanner ; public class atcoder_ABC178_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int t = sc.nextInt ( ) ; while ( t -- > 0 ) { String s = sc.next ( ) ; int flag = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == 'a' || s.charAt ( i ) == 'c' || s.charAt ( i ) == 'e' || s.charAt ( i ) == 'i' || s.charAt ( i ) == 'o' || s.charAt ( i ) == 'u' || s.charAt ( i ) == 'A' || s.charAt ( i ) == 'C' || s.charAt ( i ) == 'E' || s.charAt ( i ) == 'I' || s.charAt ( i ) == 'O' || s.charAt ( i ) == 'U' ) { flag = 1 ; break ; } } if ( flag == 1 ) { System.out.println ( "AC" ) ; } else { System.out.println ( "WA" ) ; } } } }

```
