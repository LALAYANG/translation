```java
import java.util.* ; public class atcoder_ABC152_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; HashMap < Character , Integer > map = new HashMap < > ( ) ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { if ( map.containsKey ( S.charAt ( i ) ) ) { map.put ( S.charAt ( i ) , map.get ( S.charAt ( i ) ) + 1 ) ; } else { map.put ( S.charAt ( i ) , 1 ) ; } } HashSet < Character > set = new HashSet < > ( ) ; for ( char key : map.keySet ( ) ) { set.add ( key ) ; } if ( set.size ( ) != 2 ) { System.out.println ( "No" ) ; return ; } for ( char key : set ) { if ( map.get ( key ) != 2 ) { System.out.println ( "No" ) ; return ; } } System.out.println ( "Yes" ) ; } }

```
