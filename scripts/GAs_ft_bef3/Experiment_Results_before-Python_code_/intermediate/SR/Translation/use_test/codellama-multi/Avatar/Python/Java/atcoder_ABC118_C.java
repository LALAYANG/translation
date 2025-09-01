 ```java
import java.util.Scanner ; public class codeforces_294_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int gcd = arr [ 0 ] ; for ( int i = 1 ; i < n ; i ++ ) { gcd = gcd ( arr [ i ] , gcd ) ; } System.out.println ( gcd ) ; } public static int gcd ( int a , int b ) { if ( b == 0 ) { return a ; } else { return gcd ( b , a % b ) ; } } }

```
