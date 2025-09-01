 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int h1 = sc.nextInt ( ) ; int m1 = sc.nextInt ( ) ; int h2 = sc.nextInt ( ) ; int m2 = sc.nextInt ( ) ; int ans = ( ( h1 * 60 + m1 ) - ( h2 * 60 + m2 ) ) % 1440 ; System.out.println ( ( ans / 60 ) + ":" + ( ans % 60 ) ) ; } }

```
