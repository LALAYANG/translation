 ```java
import java.util.Scanner ; public class codeforces_549_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int min = arr [ 0 ] ; int max = arr [ arr.length - 1 ] ; int minCount = 0 ; int maxCount = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] == min ) { minCount ++ ; } else if ( arr [ i ] == max ) { maxCount ++ ; } } if ( min == max ) { System.out.println ( min - max + " " + n * ( n - 1 ) / 2 ) ; } else { System.out.println ( min - max + " " + minCount * maxCount ) ; } } }

```
