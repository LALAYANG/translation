 [INST:perfect]  ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] == 1 ) { count ++ ; } } System.out.println ( count ) ; } }

```
