 ```java
import java.util.Scanner ; public class atcoder_ABC158_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; String [ ] s = new String [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; s [ i ] = sc.next ( ) ; } int ans = 0 ; int sum = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s [ i ].equals ( "B" ) ) { sum += a [ i ] ; } } ans = sum ; for ( int i = 0 ; i < n ; i ++ ) { if ( s [ i ].equals ( "A" ) ) { sum += a [ i ] ; } else { sum -= a [ i ] ; } if ( sum > ans ) { ans = sum ; } } System.out.println ( ans ) ; } }

```
