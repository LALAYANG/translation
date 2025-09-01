 ```java
import java.util.* ; public class codeforces_649_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int p = sc.nextInt ( ) ; int arr [ ] = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int count1 = 0 ; int count0 = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] == 1 ) { count1 ++ ; } else { count0 ++ ; } } int ans = 0 ; for ( int i = 0 ; i <= count0 ; i ++ ) { ans += ( ( count0 - i ) * ( count0 - i + 1 ) ) / 2 ; } for ( int i = 0 ; i <= count1 ; i ++ ) { ans += ( ( count1 - i ) * ( count1 - i + 1 ) ) / 2 ; } if ( p == 1 ) { System.out.println ( ans ) ; } else { System.out.println ( 0 ) ; } } }

```
