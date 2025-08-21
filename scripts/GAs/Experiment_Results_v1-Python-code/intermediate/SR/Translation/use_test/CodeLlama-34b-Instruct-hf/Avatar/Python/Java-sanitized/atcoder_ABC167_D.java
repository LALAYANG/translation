import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        int N = 200000;
        int K = 678997213818168535;
        int[] L = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            L[i] = i + 1;
        }
        L[0] = -1;
        List<Integer> path = new ArrayList<>();
        path.add(1);
        int ind = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        for (int current_node_index = 0; current_node_index < N + 1; current_node_index++) {
            int ne = L[x];
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
            List<Integer> loop = path.subList(t, path.size());
            if (K < path.size()) {
                System.out.println(path.get(K));
            } else {
                K = K - path.size();
                K = K % loop.size();
                System.out.println(loop.get(K));
            }
        } else {
            System.out.println(path.get(K - 1));
        }
    }
}