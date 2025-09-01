```
import java.util.* ; import java.io.* ; public class codeforces_514_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ 370 ] ; int k = 0 ; for ( int i = 1 ; i <= 370 ; i ++ ) { int x = i ; int c = 0 ; while ( x > 0 ) { x /= 10 ; c ++ ; } if ( c == 1 ) arr [ k ++ ] = i ; else if ( c == 2 ) { int a = i % 10 ; int b = i / 10 ; arr [ k ++ ] = a * 10 + b ; } else { int a = i % 10 ; int b = ( i / 10 ) % 10 ; int c = i / 100 ; arr [ k ++ ] = a + b * 10 + c * 100 ; } } System.out.println ( arr [ n - 1 ] ) ; } }

```
