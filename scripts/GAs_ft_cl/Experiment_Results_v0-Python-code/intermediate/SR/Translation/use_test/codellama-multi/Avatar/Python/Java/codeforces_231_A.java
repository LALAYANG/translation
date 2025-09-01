 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int c = 0 ; for ( int i = 0 ; i < n ; i ++ ) { int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int cnt = 0 ; if ( a == 1 || b == 1 ) cnt ++ ; if ( cnt > 0 ) c ++ ; } System.out.println ( c ) ; } }

```
