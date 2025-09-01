```
import java.util.* ; public class codeforces_266_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; HashMap < Character , Integer > map = new HashMap < > ( ) ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { char ch = s.charAt ( i ) ; if ( map.containsKey ( ch ) ) { map.put ( ch , map.get ( ch ) + 1 ) ; } else { map.put ( ch , 1 ) ; } } int count = 0 ; for ( char ch : map.keySet ( ) ) { if ( map.get ( ch ) % 2 != 0 ) { count ++ ; } } if ( count > 1 || ( count == 1 && s.length ( ) % 2 == 0 ) ) { System.out.println ( "Second" ) ; } else { System.out.println ( "First" ) ; } } }

```
