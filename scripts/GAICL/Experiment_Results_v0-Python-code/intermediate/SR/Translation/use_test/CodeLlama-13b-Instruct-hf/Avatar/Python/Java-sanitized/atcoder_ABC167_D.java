import java.util.HashMap;
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
        Map<Integer, Integer> hash = new HashMap<>();
        int currentIndex = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        for (int i = 0; i < numNodes + 1; i++) {
            int ne = L[x];
            if (ne != -1) {
                if (hash.containsKey(ne)) {
                    flag = true;
                    t = hash.get(ne);
                    break;
                }
                hash.put(ne, currentIndex);
                currentIndex++;
                x = ne;
            }
        }
        if (flag == true) {
            int[] loop = new int[currentIndex];
            for (int i = 0; i < currentIndex; i++) {
                loop[i] = hash.get(i);
            }
            if (K < currentIndex) {
                System.out.println(loop[K]);
            } else {
                K = K - currentIndex;
                K = K % currentIndex;
                System.out.println(loop[K]);
            }
        } else {
            System.out.println(hash.get(K - 1));
        }
    }
}