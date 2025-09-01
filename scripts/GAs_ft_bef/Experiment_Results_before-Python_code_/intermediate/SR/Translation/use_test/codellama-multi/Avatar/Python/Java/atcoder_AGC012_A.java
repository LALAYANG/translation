 [INST:java]
import java.util.Scanner ; import java.util.Arrays ; public class codeforces_199_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } Arrays.sort ( arr ) ; long sum = 0 ; for ( int i = n - 2 ; i >= n - 2 * n - 1 ; i -= 2 ) { sum += arr [ i ] ; } System.out.println ( sum ) ; } }

```
