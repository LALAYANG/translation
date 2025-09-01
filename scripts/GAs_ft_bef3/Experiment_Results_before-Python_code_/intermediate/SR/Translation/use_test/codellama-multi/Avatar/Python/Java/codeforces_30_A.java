 [java]
import java.util.Scanner ; public class codeforces_291_A { public static void main ( String [ ] args ) { Scanner scan = new Scanner ( System.in ) ; int a = scan.nextInt ( ) ; int b = scan.nextInt ( ) ; int n = scan.nextInt ( ) ; boolean found = false ; for ( int x = - 1000 ; x <= 1000 ; x ++ ) { if ( a * Math.pow ( x , n ) == b ) { System.out.println ( x ) ; found = true ; break ; } } if ( ! found ) { System.out.println ( "No solution" ) ; } } }

```
