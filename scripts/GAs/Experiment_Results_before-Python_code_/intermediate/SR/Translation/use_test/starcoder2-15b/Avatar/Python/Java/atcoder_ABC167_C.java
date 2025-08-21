

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
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
		int[] pre = new int[n];
		for(int i=0;i<n;i++)
		{
			pre[i] = i;
		}
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> rem = new ArrayList<ArrayList<Integer>>();
		int ans = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for(int k=0;k<i;k++)
				{
					temp.add(pre[k]);
				}
				l.add(temp);
			}
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<l.size();j++)
			{
				int ca = 0;
				for(int k=0;k<l.get(j).size();k++)
				{
					ca += c[l.get(j).get(k)][i];
				}
				if(ca<x)
				{
					rem.add(l.get(j));
				}
			}
			if(rem.size()>0)
			{
				for(int j=0;j<rem.size();j++)
				{
					l.remove(rem.get(j));
				}
				rem.clear();
			}
			if(l.size()==0)
			{
				System.out.println(-1);
				break;
			}
		}
		for(int i=0;i<l.size();i++)
		{
			int ca = 0;
			for(int j=0;j<l.get(i).size();j++)
			{
				ca += c[l.get(i).get(j)][0];
			}
			if(ans==0)
			{
				ans = ca;
			}
			else
			{
				ans = Math.min(ans,ca);
			}
		}
		System.out.println(ans);
	}
}
```
/2019-09-16-1.md
# 2019-09-16-1

## 1.

### 1.1.

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
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
		int[] pre = new int[n];
		for(int i=0;i<n;i++)
		{
			pre[i] = i;
		}
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> rem = new ArrayList<ArrayList<Integer>>();
		int ans = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for(int k=0;k<i;k++)
				{
					temp.add(pre[k]);
				}
				l.add(temp);
			}
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<l.size();j++)
			{
				int ca = 0;
				for(int k=0;k<l.get(j).size();k++)
				{
					ca += c[l.get(j).get(k)][i];
				}
				if(ca<x)
				{
					rem.add(l.get(j));
				}
			}
			if(rem.size()>0)
			{
				for(int j=0;j<rem.size();j++)
				{
					l.remove(rem.get(j));
				}
				rem.clear();
			}
			if(l.size()==0)
			{
				System.out.println(-1);
				break;
			}
		}
		for(int i=0;i<l.size();i++)
		{
			int ca = 0;
			for(int j=0;j<l.get(i).size();j++)
			{
				ca += c[l.get(i).get(j)][0];
			}
			if(ans==0)
			{
				ans = ca;
			}
			else
			{
				ans = Math.min(ans,ca);
			}
		}
		System.out.println(ans);
	}
}
```

## 2.

### 2.1.

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
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
		int[] pre = new int[n];
		for(int i=0;i<n;i++)
		{
			pre[i] = i;
		}
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> rem = new ArrayList<ArrayList<Integer>>();
		int ans = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for(int k=0;k<i;k++)
				{
					temp.add(pre[k]);
				}
				l.add(temp);
			}
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<l.size();j++)
			{
				int ca = 0;
				for(int k=0;k<l.get(j).size();k++)
				{
					ca += c[l.get(j).get(k)][i];
				}
				if(ca<x)
				{
					rem.add(l.get(j));
				}
			}
			if(rem.size()>0)
			{
				for(int j=0;j<rem.size();j++)
				{
					l.remove(rem.get(j));
				}
				rem.clear();
			}
			if(l.size()==0)
			{
				System.out.println(-1);
				break;
			}
		}
		for(int i=0;i<l.size();i++)
		{
			int ca = 0;
			for(int j=0;j<l.get(i).size();j++)
			{
				ca += c[l.get(i).get(j)][0];
			}
			if(ans==0)
			{
				ans = ca;
			}
			else
			{
				ans = Math.min(ans,ca);
			}
		}
		System.out.println(ans);
	}
}
```

## 3.

### 3.1.

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
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
		int[] pre = new int[n];
		for(int i=0;i<n;i++)
		{
			pre[i] = i;
		}
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> rem = new ArrayList<ArrayList<Integer>>();
		int ans = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for(int k=0;k<i;k++)
				{
					temp.add(pre[k]);
				}
				l.add(temp);
			}
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<l.size();j++)
			{
				int ca = 0;
				for(int k=0;k<l.get(j).size();k++)
				{
					ca += c[l.get(j).get(k)][i];
				}
				if(ca<x)
				{
					rem.add(l.get(j));
				}
			}
			if(rem.size()>0)
			{
				for(int j=0;j<rem.size();j++)
				{
					l.remove(rem.get(j));
				}
				rem.clear();
			}
			if(l.size()==0)
			{
				System.out.println(-1);
				break;
			}
		}
		for(int i=0;i<l.size();i++)
		{
			int ca = 0;
			for(int j=0;j<l.get(i).size();j++)
			{
				ca += c[l.get(i).get(j)][0];
			}
			if(ans==0)
			{
				ans = ca;
			}
			else
			{
				ans = Math.min(ans,ca);
			}
		}
		System.out.println(ans);
	}
}
```

## 4.

### 4.1.

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
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
		int[] pre = new int[n];
		for(int i=0;i<n;i++)
		{
			pre[i] = i;
		}
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> rem = new ArrayList<ArrayList<Integer>>();
		int ans = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for(int k=0;k<i;k++)
				{
					temp.add(pre[k]);
				}
				l.add(temp);
			}
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<l.size();j++)
			{
				int ca = 0;
				for(int k=0;k<l.get(j).size();k++)
				{
					ca += c[l.get(j).get(k)][i];
				}
				if(ca<x)
				{
					rem.add(l.get
