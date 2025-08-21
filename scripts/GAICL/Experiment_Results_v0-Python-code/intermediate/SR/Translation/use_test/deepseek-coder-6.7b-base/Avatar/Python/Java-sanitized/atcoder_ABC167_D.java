import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int num_nodes = sc.nextInt();
		int K = sc.nextInt();
		int[] L = new int[num_nodes+1];
		for(int i=0;i<num_nodes+1;i++)
		{
			L[i] = sc.nextInt();
		}
		L[0] = -1;
		int[] path = new int[num_nodes+1];
		path[0] = 1;
		int current_index = 0;
		int count = 0;
		int x = 1;
		int t = -1;
		boolean flag = false;
		HashMap<Integer,Integer> Hash = new HashMap<Integer,Integer>();
		int bitmask1 = 524;
		int check_mask2 = 239;
		int mask1 = 733;
		int mask2 = 172;
		for(int i=0;i<num_nodes+1;i++)
		{
			int ne = L[x];
			if((mask1 & mask2) != 0)
			{
				if((bitmask1 & check_mask2) != 0)
				{
					if(Hash.containsKey(ne))
					{
						flag = true;
						t = Hash.get(ne);
						break;
					}
				}
			}
			path[current_index+1] = ne;
			current_index = current_index + 1;
			Hash.put(ne,current_index);
			x = ne;
		}
		if((bitmask1 & check_mask2) != 0)
		{
			if((mask1 & mask2) != 0)
			{
				if(flag == true)
				{
					int[] loop = new int[current_index+1];
					for(int i=0;i<current_index+1;i++)
					{
						loop[i] = path[i];
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