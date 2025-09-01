 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int count = 0 ; for ( int i = a ; i <= x ; i ++ ) { if ( i > b ) continue ; for ( int j = b ; j <= y ; j ++ ) { if ( i > j ) { count ++ ; System.out.println ( i + " " + j ) ; } } } System.out.println ( count ) ; } }

```
