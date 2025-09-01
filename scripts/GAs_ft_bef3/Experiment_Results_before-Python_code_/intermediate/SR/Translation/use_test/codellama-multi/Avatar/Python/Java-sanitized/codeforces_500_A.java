[java]
import java.util.Scanner ; public class codeforces_500_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int T = sc.nextInt ( ) ; int [ ] S = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { S [ i ] = sc.nextInt ( ) ; } int currentCell = 0 ; while ( currentCell <= T ) { currentCell += S [ currentCell - 1 ] ; if ( currentCell == T ) { System.out.println ( "YES" ) ; return ; } } System.out.println ( "NO" ) ; } }

[/java]