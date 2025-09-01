```java
import java.util.Scanner ; public class codeforces_279_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; long x = sc.nextLong ( ) ; long y = sc.nextLong ( ) ; long a = sc.nextLong ( ) ; long b = sc.nextLong ( ) ; long lcm = ( x * y ) / ( gcd ( x , y ) ) ; System.out.println ( b / lcm - ( a - 1 ) / lcm ) ; } static long gcd ( long x , long y ) { if ( x == 0 ) return y ; return gcd ( y % x , x ) ; } }

```
