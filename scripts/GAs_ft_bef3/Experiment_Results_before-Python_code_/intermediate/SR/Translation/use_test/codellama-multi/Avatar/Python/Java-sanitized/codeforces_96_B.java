[java]
import java.util.Scanner ; public class codeforces_96_B { public static void main ( String [ ] args ) { Scanner stdIn = new Scanner ( System.in ) ; int n = stdIn.nextInt ( ) ; int m = ( int ) ( Math.log10 ( n ) + 1 ) ; int ans = 0 ; for ( int i = 0 ; i < m ; i ++ ) { int x = n % 10 ; n /= 10 ; if ( x > 4 ) { ans = ans * 10 + 7 ; } else { ans = ans * 10 + 4 ; } } System.out.println ( ans ) ; } }

[/java]