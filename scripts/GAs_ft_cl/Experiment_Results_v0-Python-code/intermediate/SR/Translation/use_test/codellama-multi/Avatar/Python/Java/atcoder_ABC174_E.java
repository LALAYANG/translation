 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int a = 1 ; int b = 0 ; for ( int i = 0 ; i < n ; i ++ ) { b = Math.max ( b , arr [ i ] ) ; } int ans = b ; while ( a <= b ) { int mid = ( a + b ) / 2 ; if ( check ( arr , k , mid ) ) { ans = mid ; b = mid - 1 ; } else { a = mid + 1 ; } } System.out.println ( ans ) ; } public static boolean check ( int [ ] arr , int k , int mid ) { int cnt = 0 ; for ( int i = 0 ; i < arr.length ; i ++ ) { if ( arr [ i ] % mid == 0 ) { cnt ++ ; } cnt -= arr [ i ] / mid ; } return cnt >= 0 ; } }

```
