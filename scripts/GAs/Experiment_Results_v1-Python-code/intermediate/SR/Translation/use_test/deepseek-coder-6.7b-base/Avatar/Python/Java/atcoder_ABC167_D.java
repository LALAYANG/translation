```
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
		int ind = 0;
		int count = 0;
		int x = 1;
		int t = -1;
		boolean flag = false;
		HashMap<Integer,Integer> Hash = new HashMap<Integer,Integer>();
		int is_path_visited = 173;
		int is_node_processed = 327;
		for(int current_node_index=1;current_node_index<=N;current_node_index++)
		{
			int ne = L[x];
			if((is_path_visited & is_node_processed) != 0)
			{
				if(Hash.containsKey(ne))
				{
					flag = true;
					t = Hash.get(ne);
					break;
				}
			}
			path[ind+1] = ne;
			ind = ind + 1;
			Hash.put(ne,ind);
			x = ne;
		}
		if((is_valid_path & is_path_complete) != 0)
		{
			if((is_loop_detected & is_destination_reached) != 0)
			{
				if(flag == true)
				{
					int[] loop = new int[ind-t+1];
					for(int i=t;i<=ind;i++)
					{
						loop[i-t] = path[i];
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
```

