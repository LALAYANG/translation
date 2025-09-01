 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; if ( b <= c || d <= a ) { System.out.println ( 0 ) ; } else { int [ ] arr = { a , b , c , d } ; Arrays.sort ( arr ) ; System.out.println ( arr [ 2 ] - arr [ 1 ] ) ; } } }

```
