```java
import java.util.Scanner ; public class codeforces_265_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.nextLine ( ) ; String v = "aeiouyAEIOUY" ; for ( int i = s.length ( ) - 1 ; i >= 0 ; i -- ) { if ( s.charAt ( i ) == ' ' || s.charAt ( i ) == '?' ) continue ; else { if ( v.contains ( "" + s.charAt ( i ) ) ) { System.out.println ( "YES" ) ; break ; } else { System.out.println ( "NO" ) ; break ; } } } } }

```
