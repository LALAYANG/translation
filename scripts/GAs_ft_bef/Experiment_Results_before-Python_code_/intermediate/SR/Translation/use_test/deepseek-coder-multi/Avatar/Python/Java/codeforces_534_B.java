```java
import java.util.Scanner ; public class codeforces_160_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; int sum = 0 ; int v = a ; for ( int i = 0 ; i < c ; i ++ ) { if ( v - b > ( c - i - 1 ) * d ) { v = ( c - i - 1 ) * d + b ; } sum += v ; v += d ; } System.out.println ( sum ) ; } }

```
