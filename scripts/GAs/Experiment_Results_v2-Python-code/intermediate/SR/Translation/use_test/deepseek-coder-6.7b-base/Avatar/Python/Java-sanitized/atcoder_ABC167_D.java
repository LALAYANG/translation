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
		int[] L = new int[N+1];
		for(int i=1;i<=N;i++)
		{
			L[i] = sc.nextInt();
		}
		L[0] = -1;
		int[] path = new int[N+1];
		int currentIndex = 0;
		int count = 0;
		int x = 1;
		int t = -1;
		boolean flag = false;
		HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>();
		int FirstValue = 763;
		int SecondValue = 240;
		for(int i=1;i<=N;i++)
		{
			int ne = L[x];
			if((FirstValue & SecondValue) != 0)
			{
				if(visited.containsKey(ne))
				{
					flag = true;
					t = visited.get(ne);
					break;
				}
			}
			path[i] = ne;
			currentIndex = currentIndex + 1;
			visited.put(ne,currentIndex);
			x = ne;
		}
		int MediumValue = 771;
		int LargeValue = 905;
		int MinValue = 21;
		int MaxValue = 911;
		if((MediumValue & LargeValue) != 0)
		{
			if((MinValue & MaxValue) != 0)
			{
				if(flag == true)
				{
					int[] loop = new int[N+1];
					for(int i=t;i<=N;i++)
					{
						loop[i-t+1] = path[i];
					}
					if(K < path.length)
					{
						System.out.println(path[K]);
					}
					else
					{
						K = K - path.length;
						K = K % loop.length;
						System.out.println(loop[K]);
					}
				}
				else
				{
					System.out.println(path[K-1]);
				}
			}
		}
	}
}