 ```java
import java.util.Scanner ; public class atcoder_ABC138_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int x1 = sc.nextInt ( ) ; int y1 = sc.nextInt ( ) ; int x2 = sc.nextInt ( ) ; int y2 = sc.nextInt ( ) ; int DIF1 = x2 - x1 ; int DIF2 = y2 - y1 ; int x3 = x2 - DIF2 ; int y3 = y2 + DIF1 ; int x4 = x1 - DIF2 ; int y4 = y1 + DIF1 ; System.out.println ( x3 + " " + y3 + " " + x4 + " " + y4 ) ; sc.close ( ) ; } }

```
