import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long K = scanner.nextLong();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }
        L.add(0, -1);
        ArrayList<Integer> path = new ArrayList<>(Arrays.asList(1));
        int ind = 0;
        boolean flag = false;
        HashMap<Integer, Integer> Hash = new HashMap<>();
        for (int current_node_index = 1; current_node_index <= N; current_node_index++) {
            int ne = L.get(current_node_index);
            if (Hash.containsKey(ne)) {
                flag = true;
                int t = Hash.get(ne);
                break;
            }
            path.add(ne);
            ind++;
            Hash.put(ne, ind);
        }
        if (flag) {
            List<Integer> loop = path.subList(t, path.size());
            if (K < path.size()) {
                System.out.println(path.get((int) K));
            } else {
                K = K - path.size();
                K = K % loop.size();
                System.out.println(loop.get((int) K));
            }
        } else {
            System.out.println(path.get((int) K - 1));
        }
    }
}