 ```java
import java.util.Scanner ; public class codeforces_10_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; double [ ] x = new double [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { x [ i ] = sc.nextDouble ( ) ; } double sum = 0 ; for ( int i = 0 ; i < n ; i ++ ) { sum += x [ i ] ; } System.out.printf ( "%.2f" , sum ) ; } }

```
