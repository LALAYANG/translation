import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_nodes = scanner.nextInt();
        int K = scanner.nextInt();
        int[] L = new int[num_nodes + 1];
        for (int i = 0; i < num_nodes; i++) {
            L[i] = scanner.nextInt();
        }
        L[num_nodes] = -1;
        List<Integer> path = new ArrayList<>();
        path.add(1);
        int current_index = 0;
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
            current_index = current_index + 1;
            Hash.put(ne, current_index);
            x = ne;
        }
        int check1 = 986;
        int bitmask2 = 878;
        int divisor = 63;
        int remainder = 357;
        if ((check1 & bitmask2) != 0) {
            if ((divisor & remainder) != 0) {
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
}