```java
import java.util.* ; import java.io.* ; import java.math.* ; public class codeforces_514_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; int [ ] [ ] a = new int [ n ] [ d ] ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < d ; j ++ ) { a [ i ] [ j ] = sc.nextInt ( ) ; } } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = i + 1 ; j < n ; j ++ ) { BigInteger sum = BigInteger.ZERO ; for ( int k = 0 ; k < d ; k ++ ) { sum = sum.add ( BigInteger.valueOf ( a [ i ] [ k ] - a [ j ] [ k ] ).multiply ( BigInteger.valueOf ( a [ i ] [ k ] - a [ j ] [ k ] ) ) ) ; } if ( sum.sqrt ( ).pow ( 2 ).equals ( sum ) ) ans ++ ; } } System.out.println ( ans ) ; } }

```
