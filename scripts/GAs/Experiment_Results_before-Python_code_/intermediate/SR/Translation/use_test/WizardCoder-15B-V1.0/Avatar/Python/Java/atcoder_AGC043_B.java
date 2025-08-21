```java
import java.util.*;

public class Main {
    public static int twos_in_factorial ( int n ) {
        int count = 0;
        while ( n > 0 ) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static boolean parity_of_nCr ( int n , int i ) {
        int f = twos_in_factorial;
        return f ( n ) - f ( n - i ) - f ( i ) > 0;
    }
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ( );
        List<Integer> nums = new ArrayList<> ( );
        String[] input = sc.next ( ).split ( " " );
        for ( String s : input ) {
            nums.add ( Integer.parseInt ( s ) - 1 );
        }
        boolean no_one = false;
        if ( !nums.contains ( 0 ) ) {
            nums = new ArrayList<> ( );
            for ( int num : input ) {
                nums.add ( num / 2 );
            }
            no_one = true;
        }
        boolean is_odd = false;
        for ( int i = 0 ; i < nums.size ( ) ; i++ ) {
            if ( !parity_of_nCr ( n - 1 , i ) && ( nums.get ( i ) & 1 ) != 0 ) {
                is_odd ^= true;
            }
        }
        if ( !is_odd ) {
            System.out.println ( 0 );
        } else {
            System.out.println ( ( no_one ? 1 : 0 ) );
        }
    }
}
```
