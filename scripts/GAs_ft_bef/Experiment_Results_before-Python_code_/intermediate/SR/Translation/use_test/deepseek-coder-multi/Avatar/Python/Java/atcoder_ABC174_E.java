```java
import java.util.* ; public class codeforces_602_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int low = 1 , high = ( int ) 1e9 , ans = 0 ; while ( low <= high ) { int mid = ( low + high ) / 2 ; if ( check ( a , k , mid ) ) { ans = mid ; high = mid - 1 ; } else { low = mid + 1 ; } } System.out.println ( ans ) ; } static boolean check ( int [ ] a , int k , int mid ) { for ( int i = 0 ; i < a.length ; i ++ ) { if ( a [ i ] % mid == 0 ) k += a [ i ] / mid ; else k -= a [ i ] / mid ; } return k >= 0 ; } }

```
