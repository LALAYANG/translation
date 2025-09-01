 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } int [ ] [ ] ans = new int [ N ] [ ] ; for ( int i = 0 ; i < N ; i ++ ) { int idx = 0 ; for ( int j = 0 ; j < i ; j ++ ) { if ( A [ i ] > A [ j ] ) { idx ++ ; } } if ( idx == ans.length ) { ans [ idx ] = new int [ 1 ] ; ans [ idx ] [ 0 ] = A [ i ] ; } else { ans [ idx ] [ ans [ idx ].length ] = A [ i ] ; } } int cnt = 0 ; for ( int i = 0 ; i < ans.length ; i ++ ) { cnt += ans [ i ].length ; } System.out.println ( cnt ) ; } }

```
