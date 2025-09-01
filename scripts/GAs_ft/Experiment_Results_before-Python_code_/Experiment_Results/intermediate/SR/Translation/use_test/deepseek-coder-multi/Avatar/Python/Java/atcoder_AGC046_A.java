```
import java.util.* ; import java.io.* ; public class codeforces_270_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int t = sc.nextInt ( ) ; while ( t -- > 0 ) { int n = sc.nextInt ( ) ; int x = 360 % n ; int y = n ; while ( x != y ) { if ( x > y ) x = x - y ; else y = y - x ; } System.out.println ( 360 / x ) ; } } }

```
