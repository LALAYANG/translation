```
import java.util.* ; public class codeforces_262_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int t = sc.nextInt ( ) ; int f = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; int x = t * k ; int y = x + ( f - t ) * k ; int z = y + ( c - f ) * k ; int w = z / ( k - x ) ; System.out.println ( w - 1 ) ; } }

```
