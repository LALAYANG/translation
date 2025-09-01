```
import java.util.* ; import java.io.* ; public class codeforces_58_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; HashMap < Character , Integer > map = new HashMap < > ( ) ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { char ch = s.charAt ( i ) ; if ( map.containsKey ( ch ) ) { map.put ( ch , map.get ( ch ) + 1 ) ; } else { map.put ( ch , 1 ) ; } } int max = 0 ; char ans = ' ' ; for ( char ch : map.keySet ( ) ) { if ( map.get ( ch ) > max ) { max = map.get ( ch ) ; ans = ch ; } } System.out.println ( ans ) ; } }

```
