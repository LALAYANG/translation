 ```java
import java.util.Scanner ; public class codeforces_229_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; if ( a < 1 ) { if ( b < 1 ) { System.out.println ( a + " " + b ) ; return ; } System.out.println ( "Impossible" ) ; return ; } if ( b > a ) { int min = b ; int max = a + b - 1 ; System.out.println ( min + " " + max ) ; } else { int min = a ; int max = a + b - 1 ; if ( b == 0 ) max = a ; System.out.println ( min + " " + max ) ; } } }

```
