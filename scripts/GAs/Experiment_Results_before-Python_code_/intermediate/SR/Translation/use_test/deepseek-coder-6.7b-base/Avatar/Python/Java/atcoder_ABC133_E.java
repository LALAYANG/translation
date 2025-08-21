
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ( );
        int k = sc.nextInt ( );
        int[][] graph = new int[n][n];
        for ( int i = 0; i < n - 1; i++ ) {
            int a = sc.nextInt ( );
            int b = sc.nextInt ( );
            graph [ a - 1 ] [ b - 1 ] = 1;
            graph [ b - 1 ] [ a - 1 ] = 1;
        }
        int mod = 1000000007;
        int[][] dp = new int[n][k + 1];
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j <= k; j++ ) {
                dp [ i ] [ j ] = - 1;
            }
        }
        int ans = dfs ( 0, - 1, k, graph, dp );
        System.out.println ( ans );
    }
    public static int dfs ( int fro, int to, int f, int[][] graph, int[][] dp ) {
        if ( dp [ fro ] [ f ] != - 1 ) {
            return dp [ fro ] [ f ];
        }
        int caseNum = f;
        int colorNum = f == k ? k - 1 : k - 2;
        for ( int i = 0; i < graph [ fro ].length; i++ ) {
            if ( graph [ fro ] [ i ] == 1 && i != to ) {
                int pat = dfs ( i, fro, colorNum, graph, dp );
                if ( pat == 0 ) {
                    caseNum = 0;
                    break;
                }
                caseNum = caseNum * pat % mod;
                colorNum--;
            }
        }
        dp [ fro ] [ f ] = caseNum;
        return caseNum;
    }
}

```

