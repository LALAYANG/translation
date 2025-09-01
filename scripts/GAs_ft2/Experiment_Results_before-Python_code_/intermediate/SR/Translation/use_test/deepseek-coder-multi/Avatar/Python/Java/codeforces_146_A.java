```
import java.util.* ; public class codeforces_514_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int sum1 = 0 , sum2 = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) != '4' && s.charAt ( i ) != '7' ) { System.out.println ( "NO" ) ; return ; } if ( i < n / 2 ) sum1 += s.charAt ( i ) - '0' ; else sum2 += s.charAt ( i ) - '0' ; } if ( sum1 == sum2 ) System.out.println ( "YES" ) ; else System.out.println ( "NO" ) ; } }

```
