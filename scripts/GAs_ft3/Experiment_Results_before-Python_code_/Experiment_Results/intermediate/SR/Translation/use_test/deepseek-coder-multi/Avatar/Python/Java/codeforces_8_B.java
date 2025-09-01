```java
import java.util.* ; public class codeforces_265_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int x = 0 , y = 0 ; HashMap < String , Integer > hm = new HashMap < > ( ) ; hm.put ( "0 0" , 1 ) ; boolean flag = false ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { char ch = s.charAt ( i ) ; if ( ch == 'L' ) { x -- ; } else if ( ch == 'R' ) { x ++ ; } else if ( ch == 'U' ) { y ++ ; } else { y -- ; } String str = x + " " + y ; if ( hm.containsKey ( str ) ) { flag = true ; break ; } else { hm.put ( str , 1 ) ; } } if ( flag ) { System.out.println ( "BUG" ) ; } else { System.out.println ( "OK" ) ; } } }

```
