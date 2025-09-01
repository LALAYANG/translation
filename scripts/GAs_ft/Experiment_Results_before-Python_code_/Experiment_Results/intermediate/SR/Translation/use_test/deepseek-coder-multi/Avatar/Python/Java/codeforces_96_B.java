```java
import java.util.* ; import java.io.* ; public class codeforces_584_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; long n = sc.nextLong ( ) ; ArrayList < Long > arr = new ArrayList < > ( ) ; arr.add ( 4L ) ; arr.add ( 7L ) ; for ( int i = 0 ; i < 14 ; i ++ ) { ArrayList < Long > temp = new ArrayList < > ( ) ; for ( long x : arr ) { temp.add ( x * 10 + 4 ) ; temp.add ( x * 10 + 7 ) ; } arr = temp ; } Collections.sort ( arr ) ; for ( long x : arr ) { if ( x >= n ) { System.out.println ( x ) ; return ; } } } }

```
