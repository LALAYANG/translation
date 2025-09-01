 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; long [ ] a = new long [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextLong ( ) ; } long [ ] fact = new long [ 1000001 ] ; fact [ 0 ] = 1 ; for ( int i = 1 ; i < 1000001 ; i ++ ) { fact [ i ] = ( fact [ i - 1 ] * i ) % 1000000007 ; } long [ ] inv = new long [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { inv [ i ] = ( long ) ( Math.pow ( i + 1 , 1000000007 - 2 ) ) % 1000000007 ; } long ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { long temp = inv [ i ] + inv [ n - 1 - i ] - 1 ; ans = ( ans + a [ i ] * temp ) % 1000000007 ; } ans = ( ans * fact [ n ] ) % 1000000007 ; System.out.println ( ans ) ; } }

```
