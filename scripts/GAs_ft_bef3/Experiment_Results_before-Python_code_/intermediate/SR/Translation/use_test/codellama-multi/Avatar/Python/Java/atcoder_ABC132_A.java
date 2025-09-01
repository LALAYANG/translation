 ```java
import java.util.Scanner ; public class codeforces_139_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int [ ] arr = new int [ 26 ] ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { arr [ s.charAt ( i ) - 'a' ] ++ ; } boolean flag = true ; for ( int i = 0 ; i < 26 ; i ++ ) { if ( arr [ i ] != 2 ) { flag = false ; break ; } } if ( ! flag ) { System.out.println ( "No" ) ; } else { System.out.println ( "Yes" ) ; } } }

```
