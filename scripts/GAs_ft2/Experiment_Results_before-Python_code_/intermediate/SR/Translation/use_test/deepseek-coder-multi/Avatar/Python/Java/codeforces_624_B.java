```java
import java.util.* ; import java.io.* ; public class atcoder_ABC152_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } Arrays.sort ( A ) ; int ans = 0 ; int pre = Integer.MAX_VALUE ; for ( int i = N - 1 ; i >= 0 ; i -- ) { ans += Math.max ( 0 , Math.min ( pre - 1 , A [ i ] ) ) ; pre = Math.max ( 0 , Math.min ( pre - 1 , A [ i ] ) ) ; } System.out.println ( ans ) ; } }

```
