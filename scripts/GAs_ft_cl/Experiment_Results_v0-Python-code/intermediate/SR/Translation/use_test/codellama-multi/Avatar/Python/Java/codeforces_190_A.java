 ```java
import java.util.Scanner ; public class atcoder_ABC151_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; if ( a == 0 && b == 0 ) { System.out.println ( a + " " + b ) ; return ; } if ( a == 0 ) { System.out.println ( "Impossible" ) ; return ; } if ( b > a ) { System.out.println ( b + " " + ( a + b ) ) ; } else { System.out.println ( a + " " + ( a + b ) ) ; } } }

```
