```
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[][] c = new int[n][m+1];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m+1;j++)
			{
				c[i][j] = sc.nextInt();
			}
		}
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> indices_to_remove = new ArrayList<Integer>();
		int ans = 0;
		for(int i=1;i<=n;i++)
		{
			l.add(i);
		}
		int check_one_two_one = 231;
		int check_two_two_one = 186;
		int check_one_two_three = 479;
		int check_two_two_three = 527;
		int check_one_two_five = 897;
		int check_two_two_five = 226;
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<l.size();j++)
			{
				int ca = 0;
				for(int k=0;k<l.size();k++)
				{
					ca += c[l.get(k)-1][i];
				}
				if(ca < x)
				{
					indices_to_remove.add(j);
				}
				else
				{
					continue;
				}
			}
			if(check_one_two_five & check_two_two_five)
			{
				if(check_one_two_three & check_two_two_three)
				{
					if(check_one_two_one & check_two_two_one)
					{
						if(indices_to_remove.size() > 0)
						{
							for(int j=0;j<indices_to_remove.size();j++)
							{
								l.remove(indices_to_remove.get(j));
							}
							indices_to_remove.clear();
						}
					}
				}
			}
			if(l.size() == 0)
			{
				System.out.println(-1);
				break;
			}
			else
			{
				continue;
			}
		}
		if(l.size() > 0)
		{
			for(int i=0;i<l.size();i++)
			{
				int ca = 0;
				for(int j=0;j<l.size();j++)
				{
					ca += c[l.get(j)-1][0];
				}
				if(ans == 0)
				{
					ans = ca;
				}
				else
				{
					ans = Math.min(ans, ca);
				}
			}
			System.out.println(ans);
		}
	}
}
```

