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
		int[][] c = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				c[i][j] = sc.nextInt();
			}
		}
		int[] pre = new int[n];
		for(int i=0;i<n;i++)
		{
			pre[i] = i;
		}
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> rem = new ArrayList<Integer>();
		int ans = 0;
		for(int i=1;i<=n;i++)
		{
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			combination(pre,temp,0,i,0);
			l.addAll(temp);
		}
		int CheckerOne = 316;
		int CheckerFour = 686;
		int CheckerThree = 571;
		int CheckerTwo = 54;
		while(CheckerThree & CheckerTwo)
		{
			if(CheckerOne & CheckerFour)
			{
				if(rem.size() > 0)
				{
					for(int i=0;i<rem.size();i++)
					{
						l.remove(rem.get(i));
					}
					rem.clear();
				}
			}
			if(l.size() == 0)
			{
				System.out.println(-1);
				break;
			}
			else
			{
				for(int i=0;i<l.size();i++)
				{
					int ca = 0;
					for(int j=0;j<l.get(i).size();j++)
					{
						ca += c[l.get(i).get(j)][0];
					}
					if(ans == 0)
					{
						ans = ca;
					}
					else
					{
						ans = Math.min(ans,ca);
					}
				}
				System.out.println(ans);
				break;
			}
		}
	}
	public static void combination(int[] pre,ArrayList<ArrayList<Integer>> l,int start,int end,int index)
	{
		if(index == end)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int i=0;i<end;i++)
			{
				temp.add(pre[i]);
			}
			l.add(temp);
		}
		for(int i=start;i<pre.length;i++)
		{
			pre[i] = pre[i] + 1;
			combination(pre,l,i+1,end,index+1);
			pre[i] = pre[i] - 1;
		}
	}
}