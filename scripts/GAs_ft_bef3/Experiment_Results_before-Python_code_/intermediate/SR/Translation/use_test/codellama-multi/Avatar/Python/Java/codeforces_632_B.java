 ```java
import java.util.Scanner ; import java.util.Arrays ; public class codeforces_596_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; String s = sc.next ( ) ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int ans = 0 ; int [ ] dp = new int [ n + 1 ] ; for ( int i = 0 ; i < n ; i ++ ) { dp [ i + 1 ] = dp [ i ] + ( s.charAt ( i ) == 'B' ? a [ i ] : - a [ i ] ) ; ans = Math.max ( ans , dp [ i + 1 ] ) ; } System.out.println ( ans ) ; } }

```
