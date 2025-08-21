import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_nodes = scanner.nextInt();
        int K = scanner.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < num_nodes; i++) {
            L.add(scanner.nextInt());
        }
        L.add(0, -1);
        ArrayList<Integer> path = new ArrayList<>(Arrays.asList(1));
        int current_index = 0;
        HashMap<Integer, Integer> Hash = new HashMap<>();
        int x = 1;
        int t = -1;
        boolean flag = false;
        int bitmask1 = 524;
        int check_mask2 = 239;
        int mask1 = 733;
        int mask2 = 172;
        for (int i = 0; i < num_nodes + 1; i++) {
            int ne = L.get(x);
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
        if ((bitmask1 & check_mask2) != 0) {
            if ((mask1 & mask2) != 0) {
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