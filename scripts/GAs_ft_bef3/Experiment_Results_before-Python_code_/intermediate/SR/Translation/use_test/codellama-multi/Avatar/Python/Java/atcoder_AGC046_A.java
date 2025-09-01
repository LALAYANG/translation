 ```java
import java.util.Scanner ; public class atcoder_ABC157_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int ans = 0 ; ans = 360 / gcd ( 360 , N ) ; System.out.println ( ans ) ; } static int gcd ( int a , int b ) { if ( b == 0 ) return a ; else return gcd ( b , a % b ) ; } }

```
