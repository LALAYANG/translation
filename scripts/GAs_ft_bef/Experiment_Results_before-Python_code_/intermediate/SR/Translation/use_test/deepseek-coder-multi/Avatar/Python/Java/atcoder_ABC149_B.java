```

import java.util.Scanner ; public class atcoder_ABC146_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int A = sc.nextInt ( ) ; int B = sc.nextInt ( ) ; int C = sc.nextInt ( ) ; int X = sc.nextInt ( ) ; int Y = sc.nextInt ( ) ; int sum = 0 ; if ( A + B > C * 2 ) { if ( X > Y ) { int num = ( X - Y ) ; if ( A > C * 2 ) { sum += C * 2 * num ; } else { sum += A * num ; } if ( B > C * 2 ) { sum += C * 2 * Y ; } else { sum += B * Y ; } } else { if ( B > C * 2 ) { sum += C * 2 * X ; } else { sum += B * X ; } if ( A > C * 2 ) { sum += C * 2 * ( Y - X ) ; } else { sum += A * ( Y - X ) ; } } } else { if ( X > Y ) { if ( A > C * 2 ) { sum += C * 2 * X ; } else { sum += A * X ; } if ( B > C * 2 ) { sum += C * 2 * Y ; } else { sum += B * Y ; } } else { if ( A > C * 2 ) { sum += C * 2 * X ; } else { sum += A * X ; } if ( B > C * 2 ) { sum += C * 2 * Y ; } else { sum += B * Y ; } } System.out.println ( sum ) ; } }

```
