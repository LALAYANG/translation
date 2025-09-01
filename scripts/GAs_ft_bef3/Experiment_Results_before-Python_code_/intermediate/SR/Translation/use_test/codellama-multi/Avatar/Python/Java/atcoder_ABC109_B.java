 ```java
import java.util.* ; public class atcoder_ABC164_A { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int n = scanner.nextInt ( ) ; String [ ] s = new String [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { s [ i ] = scanner.next ( ) ; } String f = "Yes" ; for ( int i = 0 ; i < n - 1 ; i ++ ) { if ( s [ i + 1 ].charAt ( 0 ) != s [ i ].charAt ( s [ i ].length ( ) - 1 ) ) { f = "No" ; break ; } } if ( f.equals ( "Yes" ) ) { for ( int i = 0 ; i < n ; i ++ ) { if ( s [ i ].length ( ) != 1 ) { if ( s [ i ].charAt ( 0 ) != s [ i ].charAt ( s [ i ].length ( ) - 1 ) ) { f = "No" ; break ; } } } } System.out.println ( f ) ; } }

```
