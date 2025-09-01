```java
import java.util.* ; import java.io.* ; public class codeforces_514_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int [ ] ans = new int [ n ] ; int mx = arr [ n - 1 ] ; for ( int i = n - 2 ; i >= 0 ; i -- ) { ans [ i ] = Math.max ( 0 , mx - arr [ i ] + 1 ) ; if ( arr [ i ] > mx ) mx = arr [ i ] ; } System.out.println ( Arrays.toString ( ans ).replace ( "," , " " ).replace ( "[" , "" ).replace ( "]" , "" ) ) ; } }

```
