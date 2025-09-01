```
import java.util.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int a = 0 ; int b = 0 ; for ( int i = 0 ; i < m ; i ++ ) { int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; if ( x > y ) { a ++ ; } else if ( x < y ) { b ++ ; } } System.out.println ( a + " " + b ) ; } }

```
