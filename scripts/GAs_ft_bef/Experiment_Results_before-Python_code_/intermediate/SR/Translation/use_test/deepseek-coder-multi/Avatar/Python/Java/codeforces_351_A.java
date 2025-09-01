```java
import java.util.* ; import java.io.* ; public class codeforces_382_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; double arr [ ] = new double [ n ] ; for ( int i = 0 ; i < n ; ++ i ) arr [ i ] = sc.nextDouble ( ) ; Arrays.sort ( arr ) ; double sum = 0.0 ; for ( int i = 0 ; i < n ; ++ i ) sum += arr [ i ] ; double res = 1000000000.0 ; for ( int i = 0 ; i <= n ; ++ i ) { double cnt = sum + i - n ; res = Math.min ( res , Math.abs ( cnt ) ) ; } System.out.printf ( "%.3f\n" , res ) ; } }

```
