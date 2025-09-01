 ```java
import java.util.Scanner ; public class atcoder_ABC172_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int gcd = gcd ( x , y ) ; int lcm = x * y / gcd ; System.out.println ( ( b / lcm - ( a - 1 ) / lcm ) ) ; } public static int gcd ( int a , int b ) { if ( b == 0 ) return a ; return gcd ( b , a % b ) ; } }

```
