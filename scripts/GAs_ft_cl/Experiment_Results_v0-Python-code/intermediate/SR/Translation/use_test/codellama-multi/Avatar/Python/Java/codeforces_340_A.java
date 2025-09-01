 ```java
import java.util.Scanner ; public class atcoder_ABC171_E { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int lcm = lcm ( x , y ) ; int ans = b / lcm - ( a - 1 ) / lcm ; System.out.println ( ans ) ; } public static int lcm ( int x , int y ) { int gcd = gcd ( x , y ) ; return x * y / gcd ; } public static int gcd ( int x , int y ) { if ( y == 0 ) return x ; return gcd ( y , x % y ) ; } }

```
