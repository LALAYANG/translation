 ```java
import java.util.* ; public class codeforces_376_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int a [ ] = new int [ n ] ; int b [ ] = new int [ n ] ; int c [ ] = new int [ n ] ; int x = 0 , y = 0 , z = 0 ; for ( int i = 0 ; i < a.length ; i ++ ) { a [ i ] = sc.nextInt ( ) ; x += a [ i ] ; } for ( int i = 0 ; i < b.length ; i ++ ) { b [ i ] = sc.nextInt ( ) ; y += b [ i ] ; } for ( int i = 0 ; i < c.length ; i ++ ) { c [ i ] = sc.nextInt ( ) ; z += c [ i ] ; } System.out.println ( Math.abs ( x - y ) ) ; System.out.println ( Math.abs ( y - z ) ) ; } }

```
