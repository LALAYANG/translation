```java
import java.util.* ; import java.io.* ; public class codeforces_264_A { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int n = in.nextInt ( ) ; int l = 1 , r = n ; while ( l < r ) { int mid = l + ( r - l ) / 2 ; long idxcnt = ( long ) mid * ( mid + 1 ) / 2 ; if ( idxcnt < n ) l = mid + 1 ; else r = mid ; } l -- ; idxcnt = ( long ) l * ( l + 1 ) / 2 ; System.out.println ( ( int ) ( n - idxcnt ) ) ; } }

```
