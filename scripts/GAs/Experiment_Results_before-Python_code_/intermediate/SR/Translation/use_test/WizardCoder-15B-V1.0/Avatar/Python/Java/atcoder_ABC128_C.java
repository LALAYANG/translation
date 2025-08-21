```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                li[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i] = sc.nextInt();
        }
        Set<Integer> q = new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                q.add(li[i][j]);
            }
        }
        Set<Integer> r = new HashSet<>();
        for(int i=1;i<=n;i++){
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        for(int i=0;i<=q.size();i++){
            for(Set<Integer> s:Sets.combinations(q,i)){
                for(int j=0;j<m;j++){
                    if(s.stream().filter(k->li[j][k-1]==1).count()%2!=p[j]){
                        break;
                    }
                }else{
                    ans+=Math.pow(2,v.size());
                }
            }
        }
        System.out.println(ans);
    }
}
```
