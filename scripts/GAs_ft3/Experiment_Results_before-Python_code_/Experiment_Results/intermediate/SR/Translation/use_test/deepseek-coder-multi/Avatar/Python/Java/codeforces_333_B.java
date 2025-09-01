```java
import java.util.* ; import java.io.* ; public class codeforces_228_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] arr = new int [ 2 * n + 1 ] ; for ( int i = 0 ; i < m ; i ++ ) { int r = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; arr [ r - 1 ] = arr [ n + c - 1 ] = 0 ; } if ( n % 2 != 0 && arr [ n / 2 ] != 0 && arr [ n + n / 2 ] != 0 ) arr [ n / 2 ] = 0 ; int sum = 0 ; for ( int i = 0 ; i < arr.length ; i ++ ) { sum += arr [ i ] ; } System.out.println ( sum ) ; } }

```
