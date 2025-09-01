 ```java
import java.util.Scanner ; public class atcoder_ABC158_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; int [ ] b = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < n ; i ++ ) { b [ i ] = sc.nextInt ( ) ; } int sum = 0 ; for ( int i = 0 ; i < n ; i ++ ) { sum += a [ i ] ; } for ( int i = 0 ; i < n ; i ++ ) { sum += b [ i ] ; } if ( sum == 100 ) { System.out.println ( "I become the guy." ) ; } else { System.out.println ( "Oh, my keyboard!" ) ; } } }

```
