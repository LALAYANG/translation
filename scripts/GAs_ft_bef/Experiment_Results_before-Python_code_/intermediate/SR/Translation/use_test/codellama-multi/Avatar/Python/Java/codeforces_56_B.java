 ```java
import java.util.Scanner ; import java.util.Arrays ; public class codeforces_595_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; int mn = n + 1 , mx = - 1 ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; if ( a [ i ] != i + 1 ) { mn = Math.min ( mn , i ) ; mx = Math.max ( mx , i ) ; } } if ( mx == - 1 ) System.out.println ( "0 0" ) ; else { int [ ] b = new int [ n ] ; for ( int i = 0 ; i < mn ; i ++ ) b [ i ] = a [ i ] ; for ( int i = mn ; i <= mx ; i ++ ) b [ i ] = a [ mx - i ] ; for ( int i = mx + 1 ; i < n ; i ++ ) b [ i ] = a [ i ] ; if ( Arrays.equals ( a , b ) ) System.out.println ( ( mn + 1 ) + " " + ( mx + 1 ) ) ; else System.out.println ( "0 0" ) ; } } }

```
