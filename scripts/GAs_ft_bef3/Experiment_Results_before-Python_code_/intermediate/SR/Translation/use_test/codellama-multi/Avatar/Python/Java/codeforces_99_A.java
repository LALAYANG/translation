 ```java
import java.util.Scanner ; public class atcoder_ABC178_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; s = s.replace ( "." , "" ) ; if ( s.charAt ( s.length ( ) - 1 ) == '9' ) { System.out.println ( "GOTO Vasilisa." ) ; } else { int i = Integer.parseInt ( s.substring ( s.length ( ) - 1 ) ) ; if ( i < 5 ) { s = s.substring ( 0 , s.length ( ) - 1 ) ; System.out.println ( s ) ; } else { s = s.substring ( 0 , s.length ( ) - 1 ) ; int num = Integer.parseInt ( s ) + 1 ; s = String.valueOf ( num ) ; System.out.println ( s ) ; } } } }

```
