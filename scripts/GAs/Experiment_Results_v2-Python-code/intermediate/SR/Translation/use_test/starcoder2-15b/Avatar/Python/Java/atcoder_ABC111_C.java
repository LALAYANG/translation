

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++)
		{
			if(i % 2 == 0)
			{
				a[i] = sc.nextInt();
			}
			else
			{
				b[i] = sc.nextInt();
			}
		}
		int[] cnta = new int[100002 + 1];
		int[] countOfB = new int[100002 + 1];
		int vala = 0;
		int vala1 = 0;
		int maxCnta = 0;
		int maxCnta1 = 0;
		for(int i = 0; i < n; i++)
		{
			if(i % 2 == 0)
			{
				cnta[a[i]]++;
			}
		}
		for(int i = 0; i < n; i++)
		{
			if(i % 2 == 0)
			{
				if(maxCnta < cnta[a[i]])
				{
					vala = a[i];
					maxCnta = cnta[a[i]];
				}
			}
		}
		for(int i = 0; i < n; i++)
		{
			if(i % 2 == 0)
			{
				if(maxCnta1 < cnta[a[i]] && vala != a[i])
				{
					maxCnta1 = cnta[a[i]];
					vala1 = a[i];
				}
			}
		}
		int mostFrequentB = 0;
		int valb1 = 0;
		int maxCntb = 0;
		int maxCntb1 = 0;
		for(int i = 0; i < n; i++)
		{
			if(i % 2 != 0)
			{
				countOfB[b[i]]++;
			}
		}
		for(int i = 0; i < n; i++)
		{
			if(i % 2 != 0)
			{
				if(maxCntb < countOfB[b[i]])
				{
					mostFrequentB = b[i];
					maxCntb = countOfB[b[i]];
				}
			}
		}
		for(int i = 0; i < n; i++)
		{
			if(i % 2 != 0)
			{
				if(maxCntb1 < countOfB[b[i]] && mostFrequentB != b[i])
				{
					maxCntb1 = countOfB[b[i]];
					valb1 = b[i];
				}
			}
		}
		if(ValueC & ValueD)
		{
			if(ValueA & ValueB)
			{
				if(mostFrequentB != vala)
				{
					int res = 0;
					for(int i = 0; i < n; i++)
					{
						if(i % 2 == 0)
						{
							if(a[i] != vala)
							{
								res++;
							}
						}
					}
					for(int i = 0; i < n; i++)
					{
						if(i % 2 != 0)
						{
							if(b[i] != mostFrequentB)
							{
								res++;
							}
						}
					}
					System.out.println(res);
				}
				else
				{
					int diffFromMostFrequentA = 0;
					int resb = 0;
					int resa1 = 0;
					int resb1 = 0;
					for(int i = 0; i < n; i++)
					{
						if(i % 2 == 0)
						{
							if(a[i] != vala)
							{
								diffFromMostFrequentA++;
							}
							if(a[i] != vala1)
							{
								resa1++;
							}
						}
					}
					for(int i = 0; i < n; i++)
					{
						if(i % 2 != 0)
						{
							if(b[i] != mostFrequentB)
							{
								resb++;
							}
							if(b[i] != valb1)
							{
								resb1++;
							}
						}
					}
					System.out.println(Math.min(diffFromMostFrequentA + resb1, resa1 + resb));
				}
			}
		}
	}
}
```


```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		for(int i = 0; i < n; i++)
		{
			b[i] = sc.nextInt();
		}
		int[] c = new int[n];
		for(int i = 0; i < n; i++)
		{
			c[i] = sc.nextInt();
		}
		int[] d = new int[n];
		for(int i = 0; i < n; i++)
		{
			d[i] = sc.nextInt();
		}
		int[] e = new int[n];
		for(int i = 0; i < n; i++)
		{
			e[i] = sc.nextInt();
		}
		int[] f = new int[n];
		for(int i = 0; i < n; i++)
		{
			f[i] = sc.nextInt();
		}
		int[] g = new int[n];
		for(int i = 0; i < n; i++)
		{
			g[i] = sc.nextInt();
		}
		int[] h = new int[n];
		for(int i = 0; i < n; i++)
		{
			h[i] = sc.nextInt();
		}
		int[] i = new int[n];
		for(int j = 0; j < n; j++)
		{
			i[j] = sc.nextInt();
		}
		int[] j = new int[n];
		for(int k = 0; k < n; k++)
		{
			j[k] = sc.nextInt();
		}
		int[] k = new int[n];
		for(int l = 0; l < n; l++)
		{
			k[l] = sc.nextInt();
		}
		int[] l = new int[n];
		for(int m = 0; m < n; m++)
		{
			l[m] = sc.nextInt();
		}
		int[] m = new int[n];
		for(int o = 0; o < n; o++)
		{
			m[o] = sc.nextInt();
		}
		int[] n1 = new int[n];
		for(int p = 0; p < n; p++)
		{
			n1[p] = sc.nextInt();
		}
		int[] o1 = new int[n];
		for(int q = 0; q < n; q++)
		{
			o1[q] = sc.nextInt();
		}
		int[] p1 = new int[n];
		for(int r = 0; r < n; r++)
		{
			p1[r] = sc.nextInt();
		}
		int[] q1 = new int[n];
		for(int s = 0; s < n; s++)
		{
			q1[s] = sc.nextInt();
		}
		int[] r1 = new int[n];
		for(int t = 0; t < n; t++)
		{
			r1[t] = sc.nextInt();
		}
		int[] s1 = new int[n];
		for(int u = 0; u < n; u++)
		{
			s1[u] = sc.nextInt();
		}
		int[] t1 = new int[n];
		for(int v = 0; v < n; v++)
		{
			t1[v] = sc.nextInt();
		}
		int[] u1 = new int[n];
		for(int w = 0; w < n; w++)
		{
			u1[w] = sc.nextInt();
		}
		int[] v1 = new int[n];
		for(int x = 0; x < n; x++)
		{
			v1[x] = sc.nextInt();
		}
		int[] w1 = new int[n];
		for(int y = 0; y < n; y++)
		{
			w1[y] = sc.nextInt();
		}
		int[] x1 = new int[n];
		for(int z = 0; z < n; z++)
		{
			x1[z] = sc.nextInt();
		}
		int[] y1 = new int[n];
		for(int aa = 0; aa < n; aa++)
		{
			y1[aa] = sc.nextInt();
		}
		int[] z1 = new int[n];
		for(int bb = 0; bb < n; bb++)
		{
			z1[bb] = sc.nextInt();
		}
		int[] aa1 = new int[n];
		for(int cc = 0; cc < n; cc++)
		{
			aa1[cc] = sc.nextInt();
		}
		int[] bb1 = new int[n];
		for(int dd = 0; dd < n; dd++)
		{
			bb1[dd] = sc.nextInt();
		}
		int[] cc1 = new int[n];
		for(int ee = 0; ee < n; ee++)
		{
			cc1[ee] = sc.nextInt();
		}
		int[] dd1 = new int[n];
		for(int ff = 0; ff < n; ff++)
		{
			dd1[ff] = sc.nextInt();
		}
		int[] ee1 = new int[n];
		for(int gg = 0; gg < n; gg++)
		{
			ee1[gg] = sc.nextInt();
		}
		int[] ff1 = new int[n];
		for(int hh = 0; hh < n; hh++)
		{
			ff1[hh] = sc.nextInt();
		}
		int[] gg1 = new int[n];
		for(int ii = 0; ii < n; ii++)
		{
			gg1[ii] = sc.nextInt();
		}
		int[] hh1 = new int[n];
		for(int jj = 0; jj < n; jj++)
		{
			hh1[jj] = sc.nextInt();
		}
		int[] ii1 = new int[n];
		for(int kk = 0; kk < n; kk++)
		{
			ii1[kk] = sc.nextInt();
		}
		int[] jj1 = new int[n];
		for(int ll = 0; ll < n; ll++)
		{
			jj1[ll] = sc.nextInt();
		
