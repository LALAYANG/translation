 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String [ ] s = new String [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { s [ i ] = sc.next ( ) ; } String res = "Yes" ; for ( int i = 0 ; i < n ; i ++ ) { if ( s [ i ] == null ) { res = "No" ; break ; } if ( s [ i ].length ( ) != 1 ) { res = "No" ; break ; } if ( i > 0 && s [ i ].charAt ( 0 ) != s [ i - 1 ].charAt ( s [ i - 1 ].length ( ) - 1 ) ) { res = "No" ; break ; } } System.out.println ( res ) ; } }

```
