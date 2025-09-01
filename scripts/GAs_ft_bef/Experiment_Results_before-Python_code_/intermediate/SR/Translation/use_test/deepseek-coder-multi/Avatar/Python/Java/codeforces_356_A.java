```java
import java.util.* ; import java.io.* ; public class codeforces_500_A { public static void main ( String [ ] args ) throws IOException { Scanner sc = new Scanner ( System.in ) ; PrintWriter pw = new PrintWriter ( System.out ) ; int n , m ; n = sc.nextInt ( ) ; m = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < m ; i ++ ) { int l , r , x ; l = sc.nextInt ( ) ; r = sc.nextInt ( ) ; x = sc.nextInt ( ) ; for ( int j = l ; j <= r ; j ++ ) { a [ j - 1 ] = x ; } } for ( int i = 0 ; i < n ; i ++ ) { pw.print ( a [ i ] + " " ) ; } pw.println ( ) ; pw.close ( ) ; } }

```
