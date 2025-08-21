import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        int is_valid_path = 776;
        int is_path_complete = 833;
        int is_loop_detected = 883;
        int is_destination_reached = 916;
        int is_path_visited = 173;
        int is_node_processed = 327;

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        String[] L = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : L) {
            list.add(Integer.parseInt(s));
        }
        list.add(0, -1);
        int[] path = new int[N + 2];
        path[0] = 1;
        int ind = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int ne = Integer.parseInt(L[x]);
            if ((is_path_visited & is_node_processed) != 0) {
                if (Hash.containsKey(ne)) {
                    flag = true;
                    t = Hash.get(ne);
                    break;
                }
            }
            path[++ind] = ne;
            Hash.put(ne, ind);
            x = ne;
        }
        if ((is_valid_path & is_path_complete) != 0) {
            if ((is_loop_detected & is_destination_reached) != 0) {
                if (flag) {
                    List<Integer> loop = new ArrayList<>();
                    for (int i = t; i < ind; i++) {
                        loop.add(path[i]);
                    }
                    if (K < ind) {
                        System.out.println(path[K]);
                    } else {
                        K = K - ind;
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