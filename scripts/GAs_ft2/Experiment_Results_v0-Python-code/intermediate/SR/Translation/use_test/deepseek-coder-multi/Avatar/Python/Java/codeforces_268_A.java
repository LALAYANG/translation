```
import java.util.* ; public class codeforces_23_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; ArrayList < String > arr = new ArrayList < > ( ) ; for ( int i = 0 ; i < n ; i ++ ) { arr.add ( sc.next ( ) ) ; } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < n ; j ++ ) { if ( i != j ) { if ( arr.get ( i ).charAt ( 0 ) == arr.get ( j ).charAt ( arr.get ( j ).length ( ) - 1 ) ) { count ++ ; } } } } System.out.println ( count ) ; } }

```
