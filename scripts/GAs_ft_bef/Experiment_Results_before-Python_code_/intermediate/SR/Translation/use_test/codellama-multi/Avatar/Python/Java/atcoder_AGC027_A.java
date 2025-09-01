 ```java
import java.util.Scanner ; public class codeforces_51_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int x = sc.nextInt ( ) ; int a [ ] = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] > x ) { x = 0 ; break ; } else { x = x - a [ i ] ; ans ++ ; } } if ( x != 0 ) { ans -- ; } System.out.println ( ans ) ; } }

```
