 ```java
import java.io.* ; import java.util.* ; public class codeforces_628_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.next ( ) ; int n = s.length ( ) + 1 ; int a [ ] = new int [ n ] ; a [ 0 ] = 0 ; for ( int i = 1 ; i < n ; i ++ ) { a [ i ] = a [ i - 1 ] ; if ( s.charAt ( i - 1 ) == s.charAt ( i ) ) a [ i ] ++ ; } int q = sc.nextInt ( ) ; int arr [ ] = new int [ q ] ; for ( int i = 0 ; i < q ; i ++ ) { String str = sc.next ( ) ; int m = Integer.parseInt ( str.substring ( 0 , str.indexOf ( " " ) ) ) ; int l = Integer.parseInt ( str.substring ( str.indexOf ( " " ) + 1 ) ) ; arr [ i ] = a [ l - 1 ] - a [ m - 1 ] ; } for ( int i : arr ) System.out.println ( i ) ; } }

```
