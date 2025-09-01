```
import java.util.* ; public class codeforces_514_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int x = 0 ; for ( int i = 0 ; i < 1000 ; i ++ ) { if ( a * ( int ) Math.pow ( i , k ) == b ) { x = i ; break ; } } System.out.println ( x ) ; } }

```
