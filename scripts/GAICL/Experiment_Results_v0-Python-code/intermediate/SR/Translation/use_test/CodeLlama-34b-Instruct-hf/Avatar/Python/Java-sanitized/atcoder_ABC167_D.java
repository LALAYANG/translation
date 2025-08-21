import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        // Input:
        int numNodes = 200000;
        int K = 678997213818168535;
        int[] L = new int[numNodes + 1];
        L[0] = -1;
        for (int i = 1; i <= numNodes; i++) {
            L[i] = i;
        }

        // Initialize variables:
        int x = 1;
        int t = -1;
        boolean flag = false;
        HashMap<Integer, Integer> hash = new HashMap<>();
        int conditionChecker1 = 986;
        int conditionChecker2 = 878;
        int conditionChecker3 = 63;
        int conditionChecker4 = 357;
        int conditionChecker5 = 524;
        int conditionChecker6 = 239;

        // Traverse the graph:
        List<Integer> path = new ArrayList<>();
        path.add(1);
        int currentIndex = 0;
        int count = 0;
        while (true) {
            int ne = L[x];
            if (conditionChecker1 & conditionChecker2) {
                if (hash.containsKey(ne)) {
                    flag = true;
                    t = hash.get(ne);
                    break;
                }
            }
            path.add(ne);
            currentIndex++;
            hash.put(ne, currentIndex);
            x = ne;
        }

        // Check conditions:
        if (conditionChecker3 & conditionChecker4) {
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
}