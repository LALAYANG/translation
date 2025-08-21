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
        path[0] = -1;
        int current_index = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        int bitmask1 = 524;
        int bitmask2 = 878;
        int divisor = 63;
        int remainder = 357;
        int check1 = 986;
        int check_mask2 = 239;
        int mask1 = 733;
        int mask2 = 172;
        int[] loop = new int[num_nodes + 1];
        int index = 0;

        for (int i = 1; i <= num_nodes; i++) {
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
            path[current_index + 1] = ne;
            Hash.put(ne, current_index + 1);
            current_index++;
            x = ne;
        }

        if ((check1 & bitmask2) != 0) {
            if ((divisor & remainder) != 0) {
                if (flag) {
                    for (int j = t; j < path.length; j++) {
                        loop[index] = path[j];
                        index++;
                    }
                    if (K < path.length) {
                        System.out.println(path[K]);
                    } else {
                        K = K - path.length;
                        K = K % index;
                        System.out.println(loop[K]);
                    }
                } else {
                    System.out.println(path[K - 1]);
                }
            }
        }
    }
}