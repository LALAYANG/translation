 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; if ( n == 1 ) { System.out.println ( "YES" ) ; } else { while ( n % 2 == 0 ) { n = n / 2 ; } if ( n == 1 ) { System.out.println ( "YES" ) ; } else { System.out.println ( "NO" ) ; } } } }

```
