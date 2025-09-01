 ```java
import java.util.Scanner ; public class atcoder_ABC151_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = Integer.parseInt ( sc.nextLine ( ) ) ; int [ ] low = new int [ n ] ; int [ ] high = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { String [ ] s = sc.nextLine ( ).split ( " " ) ; low [ i ] = Integer.parseInt ( s [ 0 ] ) ; high [ i ] = Integer.parseInt ( s [ 1 ] ) ; } Arrays.sort ( low ) ; Arrays.sort ( high ) ; if ( n % 2 == 1 ) { System.out.println ( high [ n / 2 ] - low [ n / 2 ] + 1 ) ; } else { System.out.println ( ( high [ n / 2 - 1 ] + high [ n / 2 ] ) / 2 - ( low [ n / 2 - 1 ] + low [ n / 2 ] ) / 2 * 2 + 1 ) ; } } }

```
