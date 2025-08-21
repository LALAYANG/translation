import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_nodes, K;
        num_nodes = sc.nextInt();
        K = sc.nextInt();
        int[] L = new int[num_nodes + 1];
        for (int i = 0; i < num_nodes + 1; i++) {
            L[i] = sc.nextInt();
        }
        L[0] = -1;
        int[] path = new int[num_nodes + 1];
        int current_index = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        int bitmask1 = 524;
        int check_mask2 = 239;
        int mask1 = 733;
        int mask2 = 172;
        for (int i = 0; i < num_nodes + 1; i++) {
            int ne = L[x];
            if (mask1 & mask2) {
                if (bitmask1 & check_mask2) {
                    if (Hash.containsKey(ne)) {
                        flag = true;
                        t = Hash.get(ne);
                        break;
                    }
                }
            }
            path[current_index] = ne;
            current_index++;
            Hash.put(ne, current_index);
            x = ne;
        }
        if (ConditionChecker124 & ConditionChecker224) {
            if (ConditionChecker122 & ConditionChecker222) {
                if (flag) {
                    int[] loop = Arrays.copyOfRange(path, t, path.length);
                    if (K < path.length) {
                        System.out.println(path[K]);
                    } else {
                        K = K - path.length;
                        K = K % loop.length;
                        System.out.println(loop[K]);
                    }
                } else {
                    System.out.println(path[K - 1]);
                }
            }
        }
    }
}