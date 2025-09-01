```java
import java.util.* ; import java.io.* ; public class codeforces_50_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int [ ] b = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] % m == 0 ) b [ i ] = a [ i ] / m ; else b [ i ] = a [ i ] / m + 1 ; } int max = b [ 0 ] ; int ind = 0 ; for ( int i = 1 ; i < n ; i ++ ) { if ( b [ i ] > max ) { max = b [ i ] ; ind = i ; } } System.out.println ( ind + 1 ) ; } }

```
