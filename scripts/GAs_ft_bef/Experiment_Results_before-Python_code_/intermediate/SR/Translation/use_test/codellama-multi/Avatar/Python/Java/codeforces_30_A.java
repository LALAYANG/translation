 [java]
import java.util.Scanner ; public class codeforces_291_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int A = sc.nextInt ( ) ; int B = sc.nextInt ( ) ; int n = sc.nextInt ( ) ; int x = 0 ; int pow = 1 ; int temp = B ; boolean flag = false ; while ( temp > 0 ) { x += temp % 10 * pow ; temp /= 10 ; pow *= A ; } if ( x == B ) { System.out.println ( x ) ; } else { System.out.println ( "No solution" ) ; } } }

```
