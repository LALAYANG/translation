```
import java.util.* ; public class codeforces_581_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int min = Math.min ( n , m ) ; int max = Math.max ( n , m ) ; if ( min == 0 ) { System.out.println ( max + " " + max ) ; } else { System.out.println ( min + " " + ( min + max - 1 ) ) ; } } }

```
