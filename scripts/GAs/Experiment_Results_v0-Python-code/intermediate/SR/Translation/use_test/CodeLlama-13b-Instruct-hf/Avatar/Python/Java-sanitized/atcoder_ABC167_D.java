import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        int numNodes = 200000;
        int K = 678997213818168535;
        int[] L = new int[numNodes + 1];
        L[0] = -1;
        for (int i = 1; i <= numNodes; i++) {
            L[i] = i;
        }
        List<Integer> path = new ArrayList<>();
        path.add(1);
        int currentIndex = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        int bitmask1 = 524;
        int check_mask2 = 239;
        int mask1 = 733;
        int mask2 = 172;
        for (int i = 0; i < numNodes + 1; i++) {
            int ne = L[x];
            if ((mask1 & mask2) != 0) {
                if ((bitmask1 & check_mask2) != 0) {
                    if (Hash.containsKey(ne)) {
                        flag = true;
                        t = Hash.get(ne);
                        break;
                    }
                }
            }
            path.add(ne);
            currentIndex++;
            Hash.put(ne, currentIndex);
            x = ne;
        }
        if ((check1 & bitmask2) != 0) {
            if ((divisor & remainder) != 0) {
                if (flag == true) {
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
    }
}