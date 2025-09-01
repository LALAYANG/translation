```
import java.util.* ; import java.io.* ; public class codeforces_27_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int h = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; double angle = Math.abs ( 30 * h - 5.5 * m ) ; double ans = Math.sqrt ( a * a + b * b - 2 * a * b * Math.cos ( Math.toRadians ( angle ) ) ) ; System.out.println ( ans ) ; } }

```
