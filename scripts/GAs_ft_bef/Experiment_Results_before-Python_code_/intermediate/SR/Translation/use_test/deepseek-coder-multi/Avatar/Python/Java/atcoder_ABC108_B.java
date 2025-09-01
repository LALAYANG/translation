```java
import java.util.Scanner ; import java.util.ArrayList ; import java.util.List ; public class codeforces_27_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; List < Integer > arr = new ArrayList < > ( ) ; for ( int i = 0 ; i < 4 ; i ++ ) arr.add ( sc.nextInt ( ) ) ; int x1 = arr.get ( 0 ) ; int y1 = arr.get ( 1 ) ; int x2 = arr.get ( 2 ) ; int y2 = arr.get ( 3 ) ; int x3 = x2 - ( x2 - x1 ) ; int y3 = y2 + ( y2 - y1 ) ; int x4 = x1 - ( x2 - x1 ) ; int y4 = y1 + ( y2 - y1 ) ; System.out.println ( x3 + " " + y3 + " " + x4 + " " + y4 ) ; } }

```
