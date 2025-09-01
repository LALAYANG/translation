 ```java
import java.util.Scanner ; public class atcoder_ABC178_A { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; double x = Double.parseDouble ( scanner.nextLine ( ) ) ; int a = ( int ) x ; int b = ( int ) ( x * 10 ) ; if ( a == 9 ) { System.out.println ( "GOTO Vasilisa." ) ; } else if ( a != 9 && b < 5 ) { System.out.println ( a ) ; } else { System.out.println ( a + 1 ) ; } } }

```
