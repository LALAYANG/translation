```java
import java.util.* ; import java.io.* ; public class codeforces_580_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int l = 1 , r = 1000000000 , ans = 0 ; while ( l <= r ) { int mid = ( l + r ) / 2 ; if ( check ( a , k , mid ) ) { ans = mid ; l = mid + 1 ; } else { r = mid - 1 ; } } System.out.println ( ans ) ; } static boolean check ( int [ ] a , int k , int mid ) { int sum = 0 ; for ( int i = 0 ; i < a.length ; i ++ ) { sum += a [ i ] / mid ; } return sum >= k ; } }

```
