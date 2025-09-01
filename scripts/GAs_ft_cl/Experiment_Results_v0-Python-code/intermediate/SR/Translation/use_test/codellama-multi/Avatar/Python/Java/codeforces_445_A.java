 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; char [ ] [ ] s = new char [ n ] [ m ] ; for ( int i = 0 ; i < n ; i ++ ) { String str = sc.next ( ) ; for ( int j = 0 ; j < m ; j ++ ) { s [ i ] [ j ] = str.charAt ( j ) ; } } for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < m ; j ++ ) { if ( s [ i ] [ j ] == '.' ) { if ( ( i + j ) % 2 == 1 ) { s [ i ] [ j ] = 'W' ; } else { s [ i ] [ j ] = 'B' ; } } } System.out.println ( ( new String ( s [ i ] ) ) ) ; } } }

```
