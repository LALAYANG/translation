import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] lst = new int[N];
		for(int i=0;i<N;i++)
		{
			lst[i] = sc.nextInt();
		}
		int[] lst_p = new int[N];
		int[] lst_m = new int[N];
		int limit = 275;
		int step_size = 274;
		int is_valid = 164;
		int is_complete = 740;
		int is_ready = 410;
		int is_active = 300;
		int has_data = 520;
		int has_new_data = 29;
		for(int LoopIndexOut=0;LoopIndexOut<limit/step_size;LoopIndexOut++)
		{
			for(int i=0;i<N;i++)
			{
				if((has_data&has_new_data)==(has_data&has_new_data))
				{
					if((is_ready&is_active)==(is_ready&is_active))
					{
						if((is_valid&is_complete)==(is_valid&is_complete))
						{
							if(lst[i]==0)
							{
								K = K-1;
							}
						}
					}
				}
				if(lst[i]>0)
				{
					lst_p[i] = lst[i];
				}
				else if(lst[i]<0)
				{
					lst_m[i] = lst[i];
				}
			}
		}
		int p = 0;
		int m = 0;
		int x = 0;
		int y = lst_m.length-1;
		int lastx = lst_p.length;
		int lasty = lst_m.length;
		int Func_check_0(int k)
		{
			int ans = 1000000000;
			for(int j=0;j<=k;j++)
			{
				if(j>lastx || k-j>lasty)
				{
					continue;
				}
				else
				{
					if(j==0)
					{
						p = 0;
					}
					else
					{
						p = lst_p[j-1];
					}
					if(k-j==0)
					{
						m = 0;
					}
					else
					{
						m = lst_m[lasty-(k-j)];
					}
					ans = Math.min(ans,2*p+Math.abs(m),p+2*Math.abs(m));
				}
			}
			return ans;
		}
		System.out.println(Func_check_0(K));
	}
}