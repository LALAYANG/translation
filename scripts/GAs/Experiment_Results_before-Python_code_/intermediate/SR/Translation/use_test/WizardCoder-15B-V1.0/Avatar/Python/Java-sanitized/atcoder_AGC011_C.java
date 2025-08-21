import java.util.*;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n+1];
        int ci = 0, cb = 0, cc = 0;
        List<Integer>[] g = new ArrayList[n+1];
        for(int i=0;i<=n;i++) g.add(new ArrayList<>());
        for(int i=0;i<m;i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        for(int i=1;i<=n;i++) {
            if(vis[i]==0) {
                if(g.get(i).size()==0) ci++;
                else {
                    boolean flag = true;
                    for(int j=0;j<g.get(i).size();j++) {
                        int v = g.get(i).get(j);
                        if(vis[v]==0) {
                            flag &= dfs(v,3-vis[i],g,vis);
                        } else {
                            flag &= (vis[v]==3-vis[i]);
                        }
                    }
                    if(flag) cb++;
                    else cc++;
                }
            }
        }
        System.out.println(ci*ci+2*ci*(n-ci)+cc*cc+2*cb*cc+2*cb*cb);
    }
    public static boolean dfs(int u,int col,List<Integer>[] g,int[] vis) {
        vis[u] = col;
        for(int i=0;i<g.get(u).size();i++) {
            int v = g.get(u).get(i);
            if(vis[v]==0) {
                if(!dfs(v,3-col,g,vis)) return false;
            } else {
                if(vis[v]!=3-col) return false;
            }
        }
        return true;
    }
}