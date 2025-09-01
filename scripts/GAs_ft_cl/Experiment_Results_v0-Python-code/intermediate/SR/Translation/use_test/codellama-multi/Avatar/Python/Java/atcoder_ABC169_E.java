 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] low = new int [ n ] ; int [ ] high = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { low [ i ] = sc.nextInt ( ) ; high [ i ] = sc.nextInt ( ) ; } Arrays.sort ( low ) ; Arrays.sort ( high ) ; if ( n % 2 == 1 ) { System.out.println ( high [ n / 2 ] - low [ n / 2 ] + 1 ) ; } else { System.out.println ( ( high [ n / 2 - 1 ] + high [ n / 2 ] ) / 2 - ( low [ n / 2 - 1 ] + low [ n / 2 ] ) / 2 * 2 + 1 ) ; } } }

```
