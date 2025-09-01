 ```java
import java.util.Scanner ; public class codeforces_126_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int a [ ] = { 10 , 100 , 1000 , 10000 , 100000 } ; int sum = 0 ; for ( int i = 0 ; i < n ; i ++ ) { sum = sum + ( n % 10 ) ; n = n / 10 ; } if ( sum == 10 || sum == 100 || sum == 1000 || sum == 10000 || sum == 100000 ) { System.out.println ( 10 ) ; } else { System.out.println ( sum ) ; } } }

```
