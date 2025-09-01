```java
import java.util.* ; import java.io.* ; public class atcoder_AGC007_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; char [ ] c = sc.next ( ).toCharArray ( ) ; HashMap < Character , Integer > map = new HashMap < > ( ) ; for ( int i = 0 ; i < c.length ; i ++ ) { if ( ! map.containsKey ( c [ i ] ) ) { map.put ( c [ i ] , 1 ) ; } else { map.put ( c [ i ] , map.get ( c [ i ] ) + 1 ) ; } } if ( map.size ( ) == 1 ) { System.out.println ( 0 ) ; return ; } int ans = Integer.MAX_VALUE ; for ( char key : map.keySet ( ) ) { int tmp = map.get ( key ) ; ans = Math.min ( ans , tmp ) ; } System.out.println ( ans * 2 ) ; } }

```
