```java
import java.util.* ; public class atcoder_ABC136_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; double sum = 0 ; for ( int i = 0 ; i < N ; i ++ ) { int x = sc.nextInt ( ) ; String u = sc.next ( ) ; if ( u.equals ( "JPY" ) ) { sum += x ; } else { sum += x * 380000 ; } } System.out.println ( sum ) ; } }

```
