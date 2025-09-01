 [INST:perfect]  ```java
import java.util.Scanner ; public class atcoder_ABC159_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int [ ] listA = new int [ n ] ; int [ ] listB = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { listA [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < n ; i ++ ) { listB [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < n ; i ++ ) { if ( listA [ i ] == i + 1 ) { System.out.print ( 1 + " " ) ; } else { System.out.print ( 2 + " " ) ; } } } }

```
