 ```java
import java.util.Scanner ; public class atcoder_ABC142_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int count = 0 ; for ( int i = 1 ; i <= N ; i ++ ) { if ( i % 2 == 1 ) { count ++ ; } } double answer = count / ( double ) N ; System.out.println ( answer ) ; } }

```
