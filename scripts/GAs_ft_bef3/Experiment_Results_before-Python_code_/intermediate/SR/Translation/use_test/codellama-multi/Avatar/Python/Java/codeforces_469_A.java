 ```java
import java.util.Scanner ; public class atcoder_ABC149_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; if ( x == 0 && y == 0 ) { System.out.println ( "Oh, my keyboard!" ) ; } else { if ( x == 0 ) { x = 1 ; } if ( y == 0 ) { y = 1 ; } if ( x + y != n ) { System.out.println ( "Oh, my keyboard!" ) ; } else { System.out.println ( "I become the guy." ) ; } } } }

```
