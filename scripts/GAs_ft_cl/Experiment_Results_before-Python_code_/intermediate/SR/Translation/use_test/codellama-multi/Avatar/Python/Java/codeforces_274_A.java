 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; long k = sc.nextLong ( ) ; long [ ] arr = new long [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextLong ( ) ; } long ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] % k != 0 || ! isIn ( arr [ i ] / k , arr , k ) ) { ans ++ ; } } System.out.println ( ans ) ; } private static boolean isIn ( long x , long [ ] arr , long k ) { for ( int i = 0 ; i < arr.length ; i ++ ) { if ( arr [ i ] == x ) { return true ; } } return false ; } }

```
