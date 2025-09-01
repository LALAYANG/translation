```java
import java.util.* ; import java.io.* ; public class codeforces_489_B { public static void main ( String args [ ] ) { Scanner in = new Scanner ( System.in ) ; int n = in.nextInt ( ) ; int ans = 0 ; HashMap < Integer , Integer > hm = new HashMap < > ( ) ; for ( int i = 0 ; i < n ; i ++ ) { int x = in.nextInt ( ) ; if ( ! hm.containsKey ( x ) ) { hm.put ( x , 1 ) ; } else { hm.put ( x , hm.get ( x ) + 1 ) ; } ans = Math.max ( ans , hm.get ( x ) ) ; } for ( int i : hm.keySet ( ) ) { if ( hm.get ( i ) == ans ) { System.out.println ( i ) ; return ; } } } }

```
