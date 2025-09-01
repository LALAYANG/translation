```
import java.util.* ; public class codeforces_279_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int n = sc.nextInt ( ) ; int x = 0 ; for ( int i = 0 ; i < 1000 ; i ++ ) { if ( Math.pow ( i , n ) == b - a * i ) { x = i ; break ; } } if ( x == 0 ) { System.out.println ( "No solution" ) ; } else { System.out.println ( x ) ; } } }

```
