```java
import java.util.* ; public class codeforces_124_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; long ans = - 1 ; for ( int i = 0 ; i < 3 ; i ++ ) { for ( int j = i + 1 ; j < 4 ; j ++ ) { for ( int k = j + 1 ; k < 4 ; k ++ ) { long x = 0 ; if ( i == 0 ) x = a + b ; else if ( i == 1 ) x = a * b ; else if ( i == 2 ) x = a - b ; if ( j == 0 ) x += c ; else if ( j == 1 ) x *= c ; else if ( j == 2 ) x -= c ; if ( k == 0 ) x += d ; else if ( k == 1 ) x *= d ; else if ( k == 2 ) x -= d ; ans = Math.max ( ans , x ) ; } } } System.out.println ( ans ) ; } }

```
