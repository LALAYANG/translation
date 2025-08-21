```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] p = new int[n+1];
        for(int i=1; i<=n; i++){
            p[i] = i;
        }
        int[] h = new int[n+1];
        for(int i=1; i<=n; i++){
            h[i] = sc.nextInt();
        }
        Map<Integer, Integer> hp = new HashMap<>();
        for(int i=1; i<=n; i++){
            hp.put(i, h[i]);
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for(int i=1; i<=n; i++){
            path.put(i, new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            String[] ab = sc.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        for(int i=1; i<=n; i++){
            boolean f = true;
            for(int j : path.get(i)){
                if(hp.get(i) <= hp.get(j)){
                    f = false;
                    break;
                }
            }
            if(f){
                c++;
            }
        }
        System.out.println(c);
    }
}
``` 
