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
		int[][] c = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		int[] pre = new int[n];
		for(int i = 0; i < n; i++) {
			pre[i] = i;
		}
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<List<Integer>> rem = new ArrayList<List<Integer>>();
		int ans = 0;
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				for(int k = 0; k < j; k++) {
					List<Integer> temp = new ArrayList<Integer>();
					for(int p = 0; p < k; p++) {
						temp.add(pre[p]);
					}
					l.add(temp);
				}
			}
			for(int index = 0; index < l.size(); index++) {
				int ca = 0;
				for(int inner_index = 0; inner_index < l.get(index).size(); inner_index++) {
					ca += c[l.get(index).get(inner_index)][i];
				}
				if(ca < x) {
					rem.add(l.get(index));
				}
			}
			if(rem.size() > 0) {
				for(int index = 0; index < rem.size(); index++) {
					l.remove(rem.get(index));
				}
				rem.clear();
			}
			if(l.size() == 0) {
				System.out.println(-1);
				break;
			}
		}
		for(int i = 0; i < l.size(); i++) {
			int ca = 0;
			for(int index = 0; index < l.get(i).size(); index++) {
				ca += c[l.get(i).get(index)][0];
			}
			if(ans == 0) {
				ans = ca;
			}
			else {
				ans = Math.min(ans, ca);
			}
		}
		System.out.println(ans);
	}
}