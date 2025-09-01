```java
import java.util.* ; import java.io.* ; public class codeforces_121_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int k = sc.nextInt ( ) ; int l = 0 ; for ( char c : s.toCharArray ( ) ) { if ( c != '1' ) { break ; } l ++ ; } if ( l >= k ) { System.out.println ( 1 ) ; } else { System.out.println ( s.charAt ( l ) ) ; } } }

```
