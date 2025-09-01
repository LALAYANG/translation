```
import java.util.* ; public class atcoder_ABC141_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } int [ ] dp = new int [ N ] ; int len = 0 ; for ( int i = 0 ; i < N ; i ++ ) { int pos = Arrays.binarySearch ( dp , 0 , len , A [ i ] ) ; if ( pos < 0 ) { pos = - ( pos + 1 ) ; } dp [ pos ] = A [ i ] ; if ( pos == len ) { len ++ ; } } System.out.println ( len ) ; } }

```
