 ```java
import java.util.Scanner ; public class atcoder_ABC171_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int high = 1 ; int tower = n ; int maximum = 1 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] == a [ i - 1 ] ) { tower -- ; high ++ ; } else { if ( high > maximum ) { maximum = high ; } high = 1 ; } } if ( high > maximum ) { maximum = high ; } System.out.println ( maximum + " " + tower ) ; } }

```
