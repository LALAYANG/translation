```java
import java.util.* ; import java.io.* ; public class codeforces_664_A { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int n = in.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) arr [ i ] = in.nextInt ( ) ; int [ ] arr2 = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) arr2 [ i ] = i + 1 ; Arrays.sort ( arr ) ; for ( int i = 0 ; i < n ; i ++ ) { int temp = arr2 [ i ] ; arr2 [ i ] = arr2 [ arr [ i ] - 1 ] ; arr2 [ arr [ i ] - 1 ] = temp ; } for ( int i = 0 ; i < n - 1 ; i ++ ) System.out.print ( arr2 [ i ] + " " ) ; System.out.println ( arr2 [ n - 1 ] ) ; } }

```
