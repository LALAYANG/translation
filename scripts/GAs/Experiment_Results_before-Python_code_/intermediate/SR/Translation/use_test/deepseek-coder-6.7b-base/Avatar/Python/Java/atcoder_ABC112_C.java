```
import java.util.Scanner;
public class Main {
    public static void main ( String [ ] args ) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ( );
        int [ ] [ ] ls_xyh = new int [ n ] [ 3 ];
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
            ls_xyh [ i ] [ 0 ] = sc.nextInt ( );
            ls_xyh [ i ] [ 1 ] = sc.nextInt ( );
            ls_xyh [ i ] [ 2 ] = sc.nextInt ( );
        }
        int x0 = - 1 , y0 = - 1 , h0 = - 1;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
            if ( ls_xyh [ i ] [ 2 ] > 0 ) {
                x0 = ls_xyh [ i ] [ 0 ];
                y0 = ls_xyh [ i ] [ 1 ];
                h0 = ls_xyh [ i ] [ 2 ];
                break;
            }
        }
        int [ ] [ ] cands = new int [ 101 ] [ 101 ];
        for ( int i = 0 ;
        i < 101 ;
        i ++ ) {
            for ( int j = 0 ;
            j < 101 ;
            j ++ ) {
                cands [ i ] [ j ] = Math.max ( h0 + Math.abs ( i - x0 ) + Math.abs ( j - y0 ) , 0 );
            }
        }
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
            int x = ls_xyh [ i ] [ 0 ];
            int y = ls_xyh [ i ] [ 1 ];
            int h = ls_xyh [ i ] [ 2 ];
            for ( int j = 0 ;
            j < 101 ;
            j ++ ) {
                for ( int k = 0 ;
                k < 101 ;
                k ++ ) {
                    if ( cands [ j ] [ k ] != Math.max ( h - Math.abs ( j - x ) - Math.abs ( k - y ) , 0 ) ) {
                        cands [ j ] [ k ] = - 1;
                    }
                }
            }
        }
        int xx = - 1 , yy = - 1 , hh = - 1;
        for ( int i = 0 ;
        i < 101 ;
        i ++ ) {
            for ( int j = 0 ;
            j < 101 ;
            j ++ ) {
                if ( cands [ i ] [ j ] != - 1 ) {
                    xx = i;
                    yy = j;
                    hh = cands [ i ] [ j ];
                    break;
                }
            }
        }
        System.out.println ( xx + " " + yy + " " + hh );
    }
}

```

