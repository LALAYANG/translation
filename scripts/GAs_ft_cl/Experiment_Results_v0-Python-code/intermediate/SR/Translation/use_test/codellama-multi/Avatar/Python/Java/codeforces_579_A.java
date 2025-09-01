 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int x = 1 ; while ( n > 1 ) { int k = ( int ) ( Math.log ( n ) / Math.log ( 2 ) ) ; n -= ( int ) ( Math.pow ( 2 , k ) ) ; x ++ ; } System.out.println ( x ) ; } }

```
