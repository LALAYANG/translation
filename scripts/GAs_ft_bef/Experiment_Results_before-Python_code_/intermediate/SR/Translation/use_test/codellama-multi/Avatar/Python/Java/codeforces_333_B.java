 ```java
import java.util.Scanner ; public class codeforces_693_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] arr = new int [ n * 2 ] ; for ( int i = 0 ; i < n * 2 ; i ++ ) { arr [ i ] = 1 ; } arr [ 0 ] = arr [ n - 1 ] = arr [ n ] = arr [ 2 * n - 1 ] = 0 ; for ( int i = 0 ; i < m ; i ++ ) { int r = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; arr [ r - 1 ] = arr [ n + c - 1 ] = 0 ; } if ( n % 2 == 1 && arr [ n / 2 ] == 1 && arr [ n + n / 2 ] == 1 ) { arr [ n / 2 ] = 0 ; } int sum = 0 ; for ( int i = 0 ; i < arr.length ; i ++ ) { sum += arr [ i ] ; } System.out.println ( sum ) ; } }

```
