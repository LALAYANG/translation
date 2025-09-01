```
import java.util.* ; public class codeforces_552_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int ans = 0 ; int i = 0 ; while ( i < n - 1 ) { if ( arr [ i ] != arr [ n - 1 ] ) { ans ++ ; i += k ; } else { break ; } } if ( ans == 0 ) { System.out.println ( - 1 ) ; } else { System.out.println ( ans ) ; } } }

```
