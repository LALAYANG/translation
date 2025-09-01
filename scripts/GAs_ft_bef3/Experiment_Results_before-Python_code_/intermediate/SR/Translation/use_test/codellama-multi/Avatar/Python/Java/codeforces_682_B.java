 [java]
import java.util.* ; public class codeforces_359_A { public static void main ( String [ ] args ) { Scanner scan = new Scanner ( System.in ) ; int n = scan.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = scan.nextInt ( ) ; } Arrays.sort ( arr ) ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] > count ) { count ++ ; } } System.out.println ( count + 1 ) ; } }

[/java]
