```java
import java.util.Scanner ; public class atcoder_ABC133_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] low = new int [ N ] ; int [ ] high = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { low [ i ] = sc.nextInt ( ) ; high [ i ] = sc.nextInt ( ) ; } Arrays.sort ( low ) ; Arrays.sort ( high ) ; if ( N % 2 == 0 ) { int hh = ( high [ N / 2 - 1 ] + high [ N / 2 ] ) / 2 ; int ll = ( low [ N / 2 - 1 ] + low [ N / 2 ] ) / 2 ; System.out.println ( ( hh - ll ) * 2 + 1 ) ; } else { System.out.println ( high [ ( N + 1 ) / 2 - 1 ] - low [ ( N + 1 ) / 2 - 1 ] + 1 ) ; } } }

```
