```
import java.util.Scanner ; public class atcoder_ABC173_C { public static int gcd ( int a , int b ) { if ( b == 0 ) { return a ; } return gcd ( b , a % b ) ; } public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int N = in.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = in.nextInt ( ) ; } int [ ] L = new int [ N + 1 ] ; int [ ] R = new int [ N + 1 ] ; int max = 0 ; L [ 0 ] = 0 ; R [ N ] = 0 ; for ( int i = 0 ; i < N ; i ++ ) { L [ i + 1 ] = gcd ( L [ i ] , A [ i ] ) ; } for ( int i = N - 1 ; i >= 0 ; i -- ) { R [ i ] = gcd ( R [ i + 1 ] , A [ i ] ) ; } for ( int i = 0 ; i < N ; i ++ ) { max = Math.max ( max , gcd ( L [ i ] , R [ i + 1 ] ) ) ; } System.out.println ( max ) ; } }

```
