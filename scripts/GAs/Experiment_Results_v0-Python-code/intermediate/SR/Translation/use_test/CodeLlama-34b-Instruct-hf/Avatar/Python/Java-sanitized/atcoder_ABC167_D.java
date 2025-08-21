import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNodes = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < numNodes; i++) {
            L.add(sc.nextInt());
        }
        L.add(0, -1);
        int currentIndex = 0;
        int count = 0;
        int x = 1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        for (int i = 0; i < numNodes + 1; i++) {
            int ne = L.get(x);
            if (Hash.containsKey(ne)) {
                flag = true;
                int t = Hash.get(ne);
                break;
            }
            Hash.put(ne, currentIndex);
            currentIndex++;
            x = ne;
        }
        if (flag) {
            List<Integer> loop = L.subList(t, L.size());
            if (K < loop.size()) {
                System.out.println(loop.get(K));
            } else {
                K = K - loop.size();
                K = K % loop.size();
                System.out.println(loop.get(K));
            }
        } else {
            System.out.println(L.get(K - 1));
        }
    }
}