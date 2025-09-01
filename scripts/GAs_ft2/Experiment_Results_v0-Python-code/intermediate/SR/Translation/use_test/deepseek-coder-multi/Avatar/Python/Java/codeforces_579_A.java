```
import java.util.* ; public class codeforces_584_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int x = 0 ; while ( n > 0 ) { x ++ ; n = n - ( int ) ( Math.pow ( 2 , x ) ) ; } System.out.println ( x ) ; } }

```
