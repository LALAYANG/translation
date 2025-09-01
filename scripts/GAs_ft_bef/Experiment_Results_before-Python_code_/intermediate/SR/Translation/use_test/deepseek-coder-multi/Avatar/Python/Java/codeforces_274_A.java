```java
import java.util.* ; public class codeforces_460_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) arr [ i ] = sc.nextInt ( ) ; Arrays.sort ( arr ) ; HashSet < Integer > hs = new HashSet < > ( ) ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] % k != 0 || ! hs.contains ( arr [ i ] / k ) ) { hs.add ( arr [ i ] ) ; count ++ ; } } System.out.println ( count ) ; } }

```
