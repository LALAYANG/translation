
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
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0;i<n;i++)
		{
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		double[][] dist = new double[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				dist[i][j] = Math.sqrt(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2));
			}
		}
		double ans = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ans += dist[i][j];
			}
		}
		System.out.println(ans/n);
	}
}

```

### Explanation:

```

```


