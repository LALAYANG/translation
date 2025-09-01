 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int t = sc.nextInt ( ) ; int time = a ; int cookie = 0 ; while ( time <= t + 0.5 ) { cookie += b ; time += a ; } System.out.println ( cookie ) ; } }

```
