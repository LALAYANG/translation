 ```java
import java.util.Scanner ; public class atcoder_ABC158_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int s = sc.nextInt ( ) ; int f = sc.nextInt ( ) ; if ( s < f ) { int d = 1 ; char c = 'R' ; } else { int d = - 1 ; char c = 'L' ; } String res = "" ; int i = 1 ; int j = s ; while ( j != f ) { if ( i > n && k < m ) { n = sc.nextInt ( ) ; l = sc.nextInt ( ) ; r = sc.nextInt ( ) ; k ++ ; } if ( i == n && ( l <= j <= r || l <= j + d <= r ) ) { res += "X" ; } else { res += c ; j += d ; } i ++ ; } System.out.println ( res ) ; } }

```
