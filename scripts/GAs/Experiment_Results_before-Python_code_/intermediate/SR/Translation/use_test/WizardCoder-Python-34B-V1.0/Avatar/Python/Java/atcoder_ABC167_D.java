```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] L = new long[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextLong();
        }
        List<Long> path = new ArrayList<>();
        path.add(1L);
        int ind = 0;
        int count = 0;
        long x = 1;
        long t = -1;
        boolean flag = false;
        Map<Long, Integer> Hash = new HashMap<>();
        Hash.put(-1L, 0);
        for (int i = 0; i < N; i++) {
            long ne = L[(int) x];
            if (Hash.containsKey(ne)) {
                flag = true;
                t = Hash.get(ne);
                break;
            }
            path.add(ne);
            ind++;
            Hash.put(ne, ind);
            x = ne;
        }
        if (flag) {
            List<Long> loop = new ArrayList<>(path.subList((int) t, path.size()));
            if (K < path.size()) {
                System.out.println(path.get((int) (K - 1));
            } else {
                K = K % path.size();
                K = K % loop.size();
                System.out.println(loop.get((int) K));
            }
        } else {
            System.out.println(path.get((int) (K - 1));
        }
    }
}
``` 
