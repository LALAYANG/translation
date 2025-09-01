```java
import java.util.* ; import java.io.* ; public class codeforces_265_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = 2019 ; int [ ] a = new int [ m ] ; a [ 0 ] = 1 ; int sum = 0 ; int cur = 0 ; for ( int i = 0 ; i < n ; i ++ ) { int x = sc.nextInt ( ) ; cur = ( cur * 10 + x ) % m ; sum += a [ cur ] ; a [ cur ] ++ ; } System.out.println ( sum ) ; } }

```
