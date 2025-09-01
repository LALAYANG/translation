[java]
import java.util.Scanner ; public class atcoder_ABC135_D { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int n = scanner.nextInt ( ) ; int [ ] dp = new int [ n + 1 ] ; dp [ 1 ] = scanner.nextInt ( ) ; for ( int i = 2 ; i <= n ; i ++ ) { dp [ i ] = dp [ i - 1 ] + 1 ; if ( dp [ i ] >= 10 ) { dp [ i ] = dp [ i ] - 10 ; } } int ans = 0 ; for ( int i = 0 ; i <= n ; i ++ ) { if ( dp [ i ] == 5 ) { ans ++ ; } } System.out.println ( ans ) ; } }

[/java]