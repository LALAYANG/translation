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
		int[] p = new int[n];
		for(int i=0;i<n;i++)
		{
			p[i] = i+1;
		}
		int[] health = new int[n];
		for(int i=0;i<n;i++)
		{
			health[i] = sc.nextInt();
		}
		HashMap<Integer,ArrayList<Integer>> path = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<n;i++)
		{
			path.put(i+1,new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			path.get(a).add(b);
			path.get(b).add(a);
		}
		int c = 0;
		for(int i=0;i<n;i++)
		{
			int f = 0;
			for(int j=0;j<path.get(i+1).size();j++)
			{
				if(health[i]<=health[path.get(i+1).get(j)-1])
				{
					f = 1;
					break;
				}
			}
			if(f==0)
			{
				c++;
			}
		}
		System.out.println(c);
	}
}