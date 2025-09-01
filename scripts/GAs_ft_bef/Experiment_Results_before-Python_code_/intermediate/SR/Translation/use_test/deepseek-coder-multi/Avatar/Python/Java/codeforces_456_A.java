```
import java.util.* ; import java.io.* ; public class codeforces_622_B { public static void main ( String [ ] args ) throws IOException { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] [ ] arr = new int [ n ] [ 2 ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] [ 0 ] = sc.nextInt ( ) ; arr [ i ] [ 1 ] = sc.nextInt ( ) ; } Arrays.sort ( arr , new Comparator < int [ ] > ( ) { @ Override public int compare ( int [ ] o1 , int [ ] o2 ) { if ( o1 [ 0 ] == o2 [ 0 ] ) return o1 [ 1 ] - o2 [ 1 ] ; return o1 [ 0 ] - o2 [ 0 ] ; } } ) ; int a = arr [ 0 ] [ 1 ] ; for ( int i = 1 ; i < n ; i ++ ) { if ( arr [ i ] [ 1 ] > a ) { System.out.println ( "Happy Alex" ) ; return ; } a = arr [ i ] [ 1 ] ; } System.out.println ( "Poor Alex" ) ; } }

```
