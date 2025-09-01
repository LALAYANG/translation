 ```java
import java.util.Scanner ; public class atcoder_ABC175_A { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int n = scanner.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = scanner.nextInt ( ) ; } int sum = 0 ; int prev = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( prev != 0 && arr [ i ] - prev > 15 ) { sum += 15 ; } else { sum += arr [ i ] ; } prev = arr [ i ] ; } if ( sum > 90 ) { System.out.println ( 90 ) ; } else { System.out.println ( sum ) ; } } }

```
