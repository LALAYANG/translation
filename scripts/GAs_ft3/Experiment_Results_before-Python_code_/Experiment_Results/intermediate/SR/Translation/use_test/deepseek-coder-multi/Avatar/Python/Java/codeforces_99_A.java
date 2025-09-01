```java
import java.util.* ; public class codeforces_282_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; String [ ] arr = s.split ( "\\." ) ; String str = arr [ 0 ] ; String str1 = arr [ 1 ] ; int i = Integer.parseInt ( str1 ) ; if ( str.charAt ( str.length ( ) - 1 ) == '9' ) { System.out.println ( "GOTO Vasilisa." ) ; } else if ( str.charAt ( str.length ( ) - 1 ) != '9' && i < 5 ) { System.out.println ( str ) ; } else { str = str.substring ( 0 , str.length ( ) - 1 ) ; str = str + ( Integer.parseInt ( str ) + 1 ) ; System.out.println ( str ) ; } } }

```
