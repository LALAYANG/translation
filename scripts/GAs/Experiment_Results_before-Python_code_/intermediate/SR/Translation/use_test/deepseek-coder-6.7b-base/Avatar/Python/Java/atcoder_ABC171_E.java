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
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int total = 0;
		for(int i=0;i<n;i++)
		{
			total = total ^ a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]^total+" ");
		}
	}
}

```

