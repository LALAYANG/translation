```
import java.util.* ; public class codeforces_456_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; ArrayList < String > list = new ArrayList < > ( ) ; for ( int i = a ; i <= x ; i ++ ) { if ( i <= b ) continue ; for ( int j = b ; j <= y ; j ++ ) { if ( i > j ) { list.add ( i + " " + j ) ; } } } System.out.println ( list.size ( ) ) ; for ( String s : list ) { System.out.println ( s ) ; } } }

```
