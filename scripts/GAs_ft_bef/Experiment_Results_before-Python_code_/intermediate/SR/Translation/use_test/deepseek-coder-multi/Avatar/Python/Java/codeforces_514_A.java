```java
import java.util.* ; import java.io.* ; public class codeforces_514_A { public static void main ( String [ ] args ) throws IOException { Scanner sc = new Scanner ( System.in ) ; StringBuilder sb = new StringBuilder ( ) ; String s = sc.next ( ) ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { int x = Character.getNumericValue ( s.charAt ( i ) ) ; if ( x > 4 ) { x = 9 - x ; } sb.append ( x ) ; } if ( s.charAt ( 0 ) == '9' ) { sb.replace ( 0 , 1 , "9" ) ; } System.out.println ( sb ) ; } }

```
