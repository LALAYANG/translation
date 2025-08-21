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
		int[] p = new int[n];
		int[] health = new int[n];
		for(int i=0;i<n;i++)
		{
			p[i] = i+1;
			health[i] = sc.nextInt();
		}
		HashMap<Integer,ArrayList<Integer>> path = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<m;i++)
		{
			int a = sc.nextInt();
			int node_b = sc.nextInt();
			if(path.containsKey(a))
			{
				ArrayList<Integer> temp = path.get(a);
				temp.add(node_b);
				path.put(a,temp);
			}
			else
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(node_b);
				path.put(a,temp);
			}
			if(path.containsKey(node_b))
			{
				ArrayList<Integer> temp = path.get(node_b);
				temp.add(a);
				path.put(node_b,temp);
			}
			else
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(a);
				path.put(node_b,temp);
			}
		}
		int c = 0;
		for(int i=0;i<n;i++)
		{
			int f = 0;
			ArrayList<Integer> temp = path.get(p[i]);
			for(int j=0;j<temp.size();j++)
			{
				if(health[i] <= health[temp.get(j)-1])
				{
					f = 1;
					break;
				}
			}
			if(f == 0)
				c++;
		}
		System.out.println(c);
	}
}
```

