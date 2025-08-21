import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n+1];
        int[] g = new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u][v] = 1;
            g[v][u] = 1;
        }
        int ci = 0, cb = 0, cc = 0;
        for(int i=1;i<=n;i++){
            if(vis[i]==0){
                if(dfs(i, vis, g, ci, cb, cc)){
                    cb++;
                }else{
                    ci++;
                }
            }
        }
        System.out.println(ci*ci + 2*ci*(n-ci) + cc*cc + 2*cb*cc + 2*cb*cb);
    }

    public static boolean dfs(int u, int[] vis, int[][] g, int ci, int cb, int cc){
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        vis[u] = 1;
        while(!q.isEmpty()){
            int v = q.poll();
            for(int i=1;i<=n;i++){
                if(g[v][i]==1 && vis[i]==0){
                    vis[i] = 3-vis[v];
                    q.add(i);
                }else if(g[v][i]==1 && vis[i]!=0 && vis[i]!=3-vis[v]){
                    return false;
                }
            }
        }
        return true;
    }
}