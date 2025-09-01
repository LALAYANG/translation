 ```java
import java.util.Scanner ; public class codeforces_386_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int a [ ] = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int dp = 0 ; for ( int i = n - 1 ; i >= 0 ; i -- ) { dp = Math.max ( 0 , Math.min ( dp + 1 , a [ i ] ) ) ; } System.out.println ( dp ) ; } }

```
