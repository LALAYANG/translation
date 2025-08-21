
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
		int[] p = new int[n];
		int[] q = new int[n];
		for(int i=0;i<n;i++)
		{
			p[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			q[i] = sc.nextInt();
		}
		int pn = 0;
		int qn = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(p[i]==i+1)
				{
					pn = i;
				}
				if(q[j]==j+1)
				{
					qn = j;
				}
			}
		}
		System.out.println(Math.abs(pn-qn));
	}
}

```

