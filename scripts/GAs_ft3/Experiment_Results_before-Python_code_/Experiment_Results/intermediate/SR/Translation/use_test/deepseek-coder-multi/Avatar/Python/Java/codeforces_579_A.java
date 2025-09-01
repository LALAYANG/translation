```java
import java.util.* ; import java.io.* ; public class codeforces_26_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int x = 1 ; while ( Math.log ( n ) % 1 != 0 ) { x ++ ; n -= ( int ) Math.pow ( 2 , ( int ) Math.log ( n ) / ( int ) Math.log ( 2 ) ) ; } System.out.println ( x ) ; } }

```
