 ```java
import java.util.Scanner ; public class atcoder_ABC149_B { public static void main ( String [ ] args ) { Scanner scan = new Scanner ( System.in ) ; int n = scan.nextInt ( ) ; int x = 1 ; while ( ( int ) ( Math.log ( n ) / Math.log ( 2 ) ) % 1 != 0 ) { x ++ ; n -= Math.pow ( 2 , ( int ) ( Math.log ( n ) / Math.log ( 2 ) ) ) ; } System.out.println ( x ) ; } }

```
