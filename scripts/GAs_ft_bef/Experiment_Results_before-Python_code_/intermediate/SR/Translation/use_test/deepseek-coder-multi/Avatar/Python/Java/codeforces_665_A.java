```java
import java.util.* ; import java.io.* ; public class codeforces_584_A { public static void main ( String [ ] args ) throws IOException { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int at = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int bt = sc.nextInt ( ) ; int t1 = sc.nextInt ( ) ; int t2 = sc.nextInt ( ) ; int st = t2 + ( t1 - 5 ) * 60 ; int fin = st + at ; int now = 0 ; int ans = 0 ; while ( now < fin && now < 1140 ) { if ( now + bt > st ) ans ++ ; now += b ; } System.out.println ( ans ) ; } }

```
