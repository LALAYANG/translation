```java
import java.util.* ; public class atcoder_ABC131_C { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; long X = sc.nextLong ( ) ; long [ ] A = new long [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextLong ( ) ; } long [ ] [ ] dp = new long [ N ] [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { long min = A [ i ] ; for ( int j = 0 ; j < N ; j ++ ) { int k = i - j ; if ( k < 0 ) k += N ; min = Math.min ( min , A [ k ] ) ; dp [ j ] [ i ] = min ; } } long ans = Long.MAX_VALUE ; for ( int i = 0 ; i < N ; i ++ ) { long sum = 0 ; for ( int j = 0 ; j < N ; j ++ ) { sum += dp [ j ] [ i ] ; } sum += X * i ; ans = Math.min ( ans , sum ) ; } System.out.println ( ans ) ; } }

```
