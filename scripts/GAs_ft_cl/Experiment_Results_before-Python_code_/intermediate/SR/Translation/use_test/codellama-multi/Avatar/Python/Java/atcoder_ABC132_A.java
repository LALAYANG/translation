 ```java
import java.util.Scanner ; public class atcoder_ABC151_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; int [ ] count = new int [ 26 ] ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { count [ S.charAt ( i ) - 'a' ] ++ ; } boolean flag = true ; for ( int i = 0 ; i < 26 ; i ++ ) { if ( count [ i ] != 0 && count [ i ] != 2 ) { flag = false ; break ; } } if ( flag ) { System.out.println ( "Yes" ) ; } else { System.out.println ( "No" ) ; } } }

```
