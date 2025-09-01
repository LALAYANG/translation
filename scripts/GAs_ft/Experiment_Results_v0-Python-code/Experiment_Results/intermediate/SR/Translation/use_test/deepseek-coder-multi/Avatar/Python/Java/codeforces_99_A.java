```
import java.util.* ; public class codeforces_282_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int n = s.length ( ) ; int i = s.charAt ( n - 1 ) - '0' ; if ( i == 9 ) { System.out.println ( "GOTO Vasilisa." ) ; } else { if ( i < 5 ) { System.out.println ( s ) ; } else { System.out.println ( s.substring ( 0 , n - 1 ) + ( i + 1 ) ) ; } } } }

```
