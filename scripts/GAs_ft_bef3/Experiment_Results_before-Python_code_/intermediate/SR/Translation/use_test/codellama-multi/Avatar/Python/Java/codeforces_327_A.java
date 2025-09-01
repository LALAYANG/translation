 [INST:perfect]
```
import java.util.* ; public class atcoder_ABC149_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int count = 0 ; int zeros = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == '1' ) count ++ ; else zeros ++ ; } if ( zeros == 0 ) System.out.println ( count + n - 1 ) ; else { int zeroIndex = - 1 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == '0' ) { zeroIndex = i ; break ; } } int maxCount = 0 ; for ( int i = 0 ; i < zeros ; i ++ ) { int zeroIndex2 = - 1 ; for ( int j = 0 ; j < n ; j ++ ) { if ( s.charAt ( j ) == '0' ) { zeroIndex2 = j ; break ; } } if ( zeroIndex2 == - 1 ) break ; int count1 = 0 ; for ( int j = zeroIndex ; j < zeroIndex2 ; j ++ ) { if ( s.charAt ( j ) == '1' ) count1 ++ ; } maxCount = Math.max ( maxCount , count1 ) ; zeroIndex = zeroIndex2 ; } System.out.println ( count + maxCount ) ; } } } }

```
