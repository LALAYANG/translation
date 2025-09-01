```
import java.util.* ; public class codeforces_265_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; int ans = 0 ; if ( a == b && b == c ) { ans = n / a ; } else if ( a == b ) { int x = n / a ; int y = n / c ; ans = Math.max ( x , y ) ; } else { int x = n / a ; int y = n / b ; int z = n / c ; ans = Math.max ( x , Math.max ( y , z ) ) ; } System.out.println ( ans ) ; } }

```
