```
import java.util.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int count = 0 ; for ( int i = a ; i <= x ; i ++ ) { for ( int j = b ; j <= y ; j ++ ) { if ( i < j ) { count ++ ; } } } System.out.println ( count ) ; for ( int i = a ; i <= x ; i ++ ) { for ( int j = b ; j <= y ; j ++ ) { if ( i < j ) { System.out.println ( i + " " + j ) ; } } } } }

```
