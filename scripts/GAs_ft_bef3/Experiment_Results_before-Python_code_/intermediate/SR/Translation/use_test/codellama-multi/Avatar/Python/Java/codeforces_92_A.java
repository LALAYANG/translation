 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int N = stdIn.nextInt ( ) ; int M = stdIn.nextInt ( ) ; int i = 1 ; while ( M >= i ) { M -= i ; i = i % N + 1 ; } System.out.println ( M ) ; } }

```
