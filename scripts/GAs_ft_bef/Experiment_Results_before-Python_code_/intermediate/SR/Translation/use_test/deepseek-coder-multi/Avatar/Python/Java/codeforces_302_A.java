```
import java.util.* ; public class atcoder_ABC140_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int sa = sc.next ( ).replace ( "-" , "" ).length ( ) ; sa = Math.min ( sa , n - sa ) ; for ( int i = 0 ; i < m ; i ++ ) { int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int bb = b - a ; if ( bb % 2 == 1 && bb <= sa * 2 ) { System.out.println ( 1 ) ; } else { System.out.println ( 0 ) ; } } } }

```
