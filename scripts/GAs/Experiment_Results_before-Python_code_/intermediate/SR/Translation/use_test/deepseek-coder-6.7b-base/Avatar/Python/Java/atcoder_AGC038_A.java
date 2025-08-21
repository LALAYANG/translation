
```
import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main ( String[] args )
    {
        Scanner sc = new Scanner ( System.in );
        int H = sc.nextInt ( );
        int W = sc.nextInt ( );
        int A = sc.nextInt ( );
        int B = sc.nextInt ( );
        String[][] answer = new String[H][W];
        for ( int i = 0 ; i < H ; i++ )
        {
            for ( int j = 0 ; j < W ; j++ )
            {
                if ( i < B )
                {
                    if ( j < A )
                    {
                        answer [ i ] [ j ] = "0";
                    }
                    else
                    {
                        answer [ i ] [ j ] = "1";
                    }
                }
                else
                {
                    if ( j < A )
                    {
                        answer [ i ] [ j ] = "1";
                    }
                    else
                    {
                        answer [ i ] [ j ] = "0";
                    }
                }
            }
        }
        for ( int i = 0 ; i < H ; i++ )
        {
            System.out.println ( String.join ( "", answer [ i ] ) );
        }
    }
}

```

### Explanation:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:


