```java
import java.util.* ; import java.io.* ; public class codeforces_500_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int k , n , w ; k = sc.nextInt ( ) ; n = sc.nextInt ( ) ; w = sc.nextInt ( ) ; int total = 0 ; for ( int i = 1 ; i <= w ; i ++ ) { total += i * k ; } if ( total > n ) { System.out.println ( total - n ) ; } else { System.out.println ( 0 ) ; } } }

```
