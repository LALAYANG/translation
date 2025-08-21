import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main ( String[] args ) throws java.lang.Exception
    {
        Scanner sc = new Scanner ( System.in );
        String s = sc.nextLine ( );
        int n = s.length ( );
        int ans = 0;
        int cnt = 0;
        for ( int i = 0; i < n; i++ )
        {
            if ( s.charAt ( i ) == 'A' )
            {
                cnt++;
            }
            else if ( s.charAt ( i ) == 'B' )
            {
                if ( i + 1 < n && s.charAt ( i + 1 ) == 'C' )
                {
                    ans += cnt;
                    i++;
                }
                else
                {
                    cnt = 0;
                }
            }
            else
            {
                cnt = 0;
            }
        }
        System.out.println ( ans );
    }
}