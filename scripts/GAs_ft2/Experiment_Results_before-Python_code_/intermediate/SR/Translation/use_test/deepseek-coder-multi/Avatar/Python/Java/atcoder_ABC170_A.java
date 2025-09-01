```
import java.util.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int l = sc.nextInt ( ) ; int r = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; int ans = 0 ; if ( k > l ) { ans = k - l ; } else if ( k < r ) { ans = r - k ; } System.out.println ( ans ) ; } }

```
