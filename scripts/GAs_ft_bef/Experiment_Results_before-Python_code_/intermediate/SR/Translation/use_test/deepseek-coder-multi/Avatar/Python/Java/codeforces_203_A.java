```
import java.util.Scanner ; public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int x , t , a , b , da , db ; x = in.nextInt ( ) ; t = in.nextInt ( ) ; a = in.nextInt ( ) ; b = in.nextInt ( ) ; da = in.nextInt ( ) ; db = in.nextInt ( ) ; boolean f = false ; for ( int i = 0 ; i < t ; i ++ ) { for ( int j = 0 ; j < t ; j ++ ) { if ( a - da * i == x || b - db * j == x || a - da * i + b - db * j == x ) { f = true ; break ; } } if ( f ) { break ; } } if ( f ) { System.out.println ( "YES" ) ; } else { System.out.println ( "NO" ) ; } }

```
