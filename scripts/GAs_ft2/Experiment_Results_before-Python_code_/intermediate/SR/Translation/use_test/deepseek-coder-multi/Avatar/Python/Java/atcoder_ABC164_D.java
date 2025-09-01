```java
import java.util.* ; public class codeforces_271_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int l = 2019 ; int [ ] m = new int [ l ] ; int a = 0 , r = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { a = ( a * 10 + ( s.charAt ( i ) - '0' ) ) % l ; r = ( r + m [ a ] ) % l ; m [ a ] ++ ; } System.out.println ( r ) ; } }

```
