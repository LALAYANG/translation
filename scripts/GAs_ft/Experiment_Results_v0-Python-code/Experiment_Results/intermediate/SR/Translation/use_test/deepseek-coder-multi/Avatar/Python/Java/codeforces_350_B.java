```
import java.util.* ; public class codeforces_276_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n + 1 ] ; for ( int i = 1 ; i <= n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int [ ] dp = new int [ n + 1 ] ; for ( int i = 1 ; i <= n ; i ++ ) { dp [ i ] = dp [ a [ i ] ] + 1 ; } int mx = 0 ; int mx_ind = 0 ; for ( int i = 1 ; i <= n ; i ++ ) { if ( dp [ i ] > mx ) { mx = dp [ i ] ; mx_ind = i ; } } System.out.println ( mx ) ; ArrayList < Integer > ans = new ArrayList < > ( ) ; while ( mx_ind != 0 ) { ans.add ( mx_ind ) ; mx_ind = a [ mx_ind ] ; } Collections.reverse ( ans ) ; for ( int i = 0 ; i < ans.size ( ) ; i ++ ) { System.out.print ( ans.get ( i ) + " " ) ; } } }

```
