 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] % k != 0 || ! isInSet ( arr [ i ] / k , count ) ) { count ++ ; } } System.out.println ( count ) ; } private static boolean isInSet ( int num , int count ) { for ( int i = 0 ; i < count ; i ++ ) { if ( num == i ) { return true ; } } return false ; } }

```
