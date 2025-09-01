```java
import java.util.Scanner ; public class atcoder_ABC124_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String str = sc.next ( ) ; StringBuilder sb = new StringBuilder ( ) ; for ( int i = 0 ; i < str.length ( ) ; i ++ ) { if ( str.charAt ( i ) == '.' ) { sb.append ( 0 ) ; } else { if ( str.charAt ( i + 1 ) == '.' ) { sb.append ( 1 ) ; } else { sb.append ( 2 ) ; } i ++ ; } } System.out.println ( sb ) ; } }

```
