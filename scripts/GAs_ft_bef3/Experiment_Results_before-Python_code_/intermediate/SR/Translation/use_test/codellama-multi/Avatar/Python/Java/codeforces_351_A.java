 ```java
import java.util.Scanner ; public class atcoder_ABC148_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; double [ ] arr = new double [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextDouble ( ) ; } double sum = 0.0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] - ( int ) ( arr [ i ] ) != 0.0 ) { sum += arr [ i ] ; } } int o = 2 * n - 1 ; for ( int i = 0 ; i < n + 1 ; i ++ ) { if ( i + o >= n ) { int ans = Math.abs ( i - sum ) ; if ( ans < 2000000000 ) { System.out.println ( ans / 1000.0 ) ; return ; } } } } } }

```
