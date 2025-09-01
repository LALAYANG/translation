```
import java.util.* ; public class codeforces_58_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; if ( n == 0 && m == 0 ) { System.out.println ( "0 0" ) ; } else if ( n == 0 && m != 0 ) { System.out.println ( "Impossible" ) ; } else if ( n != 0 && m == 0 ) { System.out.println ( n + " " + n ) ; } else { int min = Math.max ( n , m ) ; int max = n + m - 1 ; System.out.println ( min + " " + max ) ; } } }

```
