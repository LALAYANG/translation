```
import java.util.* ; public class atcoder_ABC121_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } int [ ] dp = new int [ N ] ; dp [ 0 ] = A [ 0 ] ; int ans = 1 ; for ( int i = 1 ; i < N ; i ++ ) { if ( A [ i ] <= dp [ ans - 1 ] ) { dp [ ans ++ ] = A [ i ] ; } else { int l = 0 ; int r = ans - 1 ; while ( r - l > 1 ) { int mid = ( l + r ) / 2 ; if ( dp [ mid ] < A [ i ] ) { l = mid ; } else { r = mid ; } } if ( dp [ l ] < A [ i ] ) { dp [ l + 1 ] = A [ i ] ; } else { dp [ l ] = A [ i ] ; } } } System.out.println ( ans ) ; } }

```
