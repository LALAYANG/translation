 [java]
import java.util.* ; public class atcoder_ABC153_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } Arrays.sort ( a ) ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] > count ) count ++ ; } System.out.println ( count + 1 ) ; } }

[/java]
