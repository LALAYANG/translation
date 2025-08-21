import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_nodes = sc.nextInt();
        int K = sc.nextInt();
        int[] L = new int[num_nodes + 1];
        for (int i = 0; i < num_nodes; i++) {
            L[i] = sc.nextInt();
        }
        int[] path = new int[num_nodes + 1];
        path[0] = 1;
        int current_index = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        int bitmask1 = 524;
        int bitmask2 = 239;
        int divisor = 63;
        int remainder = 357;
        int check1 = 986;
        int check2 = 878;
        int mask1 = 733;
        int mask2 = 172;
        for (int i = 1; i <= num_nodes; i++) {
            int ne = L[x];
            if ((bitmask1 & bitmask2) != 0) {
                if (Hash.containsKey(ne)) {
                    flag = true;
                    t = Hash.get(ne);
                    break;
                }
            }
            path[i] = ne;
            current_index++;
            Hash.put(ne, current_index);
            x = ne;
        }
        if ((check1 & check2) != 0) {
            if ((divisor & remainder) != 0) {
                if (flag) {
                    List<Integer> loop = Arrays.asList(Arrays.copyOfRange(path, t, num_nodes + 1));
                    if (K < path.length) {
                        System.out.println(path[K]);
                    } else {
                        K = K - path.length;
                        K = K % loop.size();
                        System.out.println(loop.get(K));
                    }
                } else {
                    System.out.println(path[K - 1]);
                }
            }
        }
    }
}