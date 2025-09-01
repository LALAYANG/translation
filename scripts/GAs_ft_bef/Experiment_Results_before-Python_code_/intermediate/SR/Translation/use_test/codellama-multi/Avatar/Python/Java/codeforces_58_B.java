 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; for ( int i = n ; i > 0 ; i -- ) { if ( n % i == 0 ) { n = i ; System.out.print ( i + " " ) ; } } } }

```
