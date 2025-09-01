 ```java
import java.util.Scanner ; public class codeforces_484_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int arr [ ] = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] == 0 ) { count += arr [ i ] * ( arr [ i ] - 1 ) ; } else if ( arr [ i ] > 0 ) { if ( arr [ n - i - 1 ] > 0 ) { count += arr [ i ] * arr [ n - i - 1 ] ; } } else { if ( arr [ n - i - 1 ] < 0 ) { count += arr [ i ] * arr [ n - i - 1 ] ; } } } System.out.println ( count / 2 ) ; } }

```
