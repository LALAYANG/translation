 ```java
import java.util.Scanner ; public class atcoder_ABC132_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int x = 0 ; int y = 0 ; int [ ] [ ] d = { { 0 , - 1 } , { 0 , 1 } , { 1 , 0 } , { - 1 , 0 } } ; boolean bug = false ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { int dx = d [ s.charAt ( i ) - 'L' ] [ 0 ] ; int dy = d [ s.charAt ( i ) - 'L' ] [ 1 ] ; x += dx ; y += dy ; if ( ! bug && ( x < 0 || x >= 3 || y < 0 || y >= 3 ) ) bug = true ; if ( bug ) break ; } if ( bug ) System.out.println ( "BUG" ) ; else System.out.println ( "OK" ) ; } }

```
