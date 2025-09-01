[java]
import java.util.Scanner ; public class codeforces_637_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int max = arr [ 0 ] ; int index = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( max < arr [ i ] ) { max = arr [ i ] ; index = i ; } } System.out.println ( arr [ index ] ) ; } }

[/java]