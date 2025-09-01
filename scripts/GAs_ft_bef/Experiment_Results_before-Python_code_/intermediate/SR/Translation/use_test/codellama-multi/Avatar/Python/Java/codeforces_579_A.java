 ```java
import java.util.* ; public class codeforces_545_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int x = 1 ; while ( n > 1 ) { x ++ ; n -= 2 * ( int ) Math.pow ( 2 , ( int ) Math.log ( n ) / Math.log ( 2 ) ) ; } System.out.println ( x ) ; } }

```
