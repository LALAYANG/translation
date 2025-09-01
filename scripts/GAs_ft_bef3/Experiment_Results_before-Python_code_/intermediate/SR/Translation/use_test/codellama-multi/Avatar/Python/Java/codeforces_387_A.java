 ```java
import java.util.Scanner ; public class atcoder_ABC138_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int h1 = sc.nextInt ( ) ; int m1 = sc.nextInt ( ) ; int h2 = sc.nextInt ( ) ; int m2 = sc.nextInt ( ) ; m1 += 60 * h1 ; m2 += 60 * h2 ; m2 = m1 - m2 ; m2 %= 1440 ; System.out.println ( String.format ( "%02d:%02d" , m2 / 60 , m2 % 60 ) ) ; } }

```
