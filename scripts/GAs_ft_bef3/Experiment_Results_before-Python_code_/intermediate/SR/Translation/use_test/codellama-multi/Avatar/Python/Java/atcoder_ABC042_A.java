 ```java
import java.util.Scanner ; public class atcoder_ABC176_A { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int a = scanner.nextInt ( ) ; int b = scanner.nextInt ( ) ; int c = scanner.nextInt ( ) ; int s = a + b + c ; if ( s != 17 ) { System.out.println ( "NO" ) ; } else { int count = 0 ; if ( a == 5 ) { count ++ ; } if ( b == 5 ) { count ++ ; } if ( c == 5 ) { count ++ ; } if ( count != 2 ) { System.out.println ( "NO" ) ; } else { System.out.println ( "YES" ) ; } } } }

```
