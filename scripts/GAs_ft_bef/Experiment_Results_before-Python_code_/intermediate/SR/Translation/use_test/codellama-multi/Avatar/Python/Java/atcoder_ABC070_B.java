 ```java
import java.util.Scanner ; public class atcoder_ABC172_A { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int a = scanner.nextInt ( ) ; int b = scanner.nextInt ( ) ; int c = scanner.nextInt ( ) ; int d = scanner.nextInt ( ) ; if ( b <= c || d <= a ) { System.out.println ( 0 ) ; } else { int [ ] array = { a , b , c , d } ; Arrays.sort ( array ) ; System.out.println ( array [ 2 ] - array [ 1 ] ) ; } } }

```
