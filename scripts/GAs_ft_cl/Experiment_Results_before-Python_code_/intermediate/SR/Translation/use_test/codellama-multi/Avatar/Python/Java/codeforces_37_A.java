 ```java
import java.util.Scanner ; public class codeforces_59_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int tower = n ; int high = 1 ; int maximum = 1 ; for ( int i = 1 ; i < n ; i ++ ) { if ( arr [ i ] == arr [ i - 1 ] ) { tower -- ; high ++ ; } else { if ( high > maximum ) { maximum = high ; } high = 1 ; } } if ( high > maximum ) { maximum = high ; } System.out.println ( maximum + " " + tower ) ; } }

```
