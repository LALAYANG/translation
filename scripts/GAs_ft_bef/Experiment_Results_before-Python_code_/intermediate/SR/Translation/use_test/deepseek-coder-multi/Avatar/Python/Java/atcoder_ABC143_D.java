```
import java.util.* ; public class atcoder_ABC147_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; ArrayList < Integer > a = new ArrayList < > ( ) ; for ( int i = 0 ; i < n ; i ++ ) { a.add ( sc.nextInt ( ) ) ; } a.sort ( ) ; long ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = i + 1 ; j < n ; j ++ ) { int x = a.get ( i ) ; int y = a.get ( j ) ; int z = x + y ; int ub = Collections.binarySearch ( a , z ) ; if ( ub < 0 ) { ub = - ub - 1 ; } int lb = Collections.binarySearch ( a , x - y ) ; if ( lb < 0 ) { lb = - lb - 1 ; } lb = Math.max ( lb , 0 ) ; if ( ub <= i || ub <= j ) { ub -- ; } if ( lb <= i || lb <= j ) { lb ++ ; } ans += Math.max ( ub - lb , 0 ) ; } } System.out.println ( ans / 3 ) ; } }

```
