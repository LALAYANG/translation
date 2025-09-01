```
import java.util.Scanner ; public class codeforces_522_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int n = sc.nextInt ( ) ; int x = 0 ; for ( int i = 0 ; i < 1001 ; i ++ ) { if ( a * ( int ) Math.pow ( i , n ) == b ) { x = i ; break ; } } System.out.println ( x ) ; } }

```
