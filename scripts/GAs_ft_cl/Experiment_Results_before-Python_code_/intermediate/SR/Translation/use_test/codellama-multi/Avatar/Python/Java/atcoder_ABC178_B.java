 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; int ans = Math.max ( a * c , b * d ) ; ans = Math.max ( ans , a * d ) ; ans = Math.max ( ans , b * c ) ; System.out.println ( ans ) ; } }

```
