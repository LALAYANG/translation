 ```java
import java.util.Scanner ; public class atcoder_ABC158_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int gcd = a [ 0 ] ; for ( int i = 1 ; i < n ; i ++ ) { gcd = gcd ( gcd , a [ i ] ) ; } System.out.println ( gcd ) ; } public static int gcd ( int a , int b ) { if ( b == 0 ) return a ; else return gcd ( b , a % b ) ; } }

```
