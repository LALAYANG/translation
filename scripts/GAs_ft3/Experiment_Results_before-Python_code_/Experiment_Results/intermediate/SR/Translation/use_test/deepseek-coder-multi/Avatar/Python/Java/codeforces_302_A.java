```java
import java.util.* ; import java.io.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int sa = sc.next ( ).replace ( "-" , "" ).length ( ) ; sa = Math.min ( n - sa , sa ) ; StringBuilder sb = new StringBuilder ( ) ; for ( int i = 0 ; i < m ; i ++ ) { int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; b -= a ; if ( b % 2 == 1 && b <= sa * 2 ) sb.append ( "1\n" ) ; else sb.append ( "0\n" ) ; } System.out.println ( sb ) ; } }

```
