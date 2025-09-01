```java
import java.util.* ; public class codeforces_59_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; for ( int i = n ; i >= 1 ; i -- ) { if ( n % i == 0 ) { n = i ; System.out.print ( i + " " ) ; } } } }

```
